package com.diviso.graeshoppe.payment.service.impl;

import com.diviso.graeshoppe.payment.service.KafkaMessagingService;
import com.diviso.graeshoppe.payment.service.NotificationService;
import com.diviso.graeshoppe.payment.service.PaymentService;
import com.diviso.graeshoppe.payment.client.bpmn.api.FormsApi;
import com.diviso.graeshoppe.payment.client.bpmn.api.TasksApi;
import com.diviso.graeshoppe.payment.client.bpmn.model.RestFormProperty;
import com.diviso.graeshoppe.payment.client.bpmn.model.SubmitFormRequest;
import com.diviso.graeshoppe.payment.domain.Payment;
import com.diviso.graeshoppe.payment.model.ProcessPaymentRequest;
import com.diviso.graeshoppe.payment.repository.PaymentRepository;
import com.diviso.graeshoppe.payment.repository.search.PaymentSearchRepository;
import com.diviso.graeshoppe.payment.resource.CommandResource;
import com.diviso.graeshoppe.payment.resource.assembler.ResourceAssembler;
import com.diviso.graeshoppe.payment.service.dto.NotificationDTO;
import com.diviso.graeshoppe.payment.service.dto.PaymentDTO;
import com.diviso.graeshoppe.payment.service.mapper.PaymentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing Payment.
 */
@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

	private final Logger log = LoggerFactory.getLogger(PaymentServiceImpl.class);

	@Autowired
	private TasksApi tasksApi;
	@Autowired
	private FormsApi formsApi;

	@Autowired
	private ResourceAssembler resourceAssembler;
	private final PaymentRepository paymentRepository;

	private final PaymentMapper paymentMapper;

	@Autowired
	private NotificationService notificationService;

	@Autowired
	private KafkaMessagingService messagingService;

	private final PaymentSearchRepository paymentSearchRepository;

	public PaymentServiceImpl(PaymentRepository paymentRepository, PaymentMapper paymentMapper,
			PaymentSearchRepository paymentSearchRepository ) {
		this.paymentRepository = paymentRepository;
		this.paymentMapper = paymentMapper;
		this.paymentSearchRepository = paymentSearchRepository;
	}

	/**
	 * Save a payment.
	 *
	 * @param paymentDTO the entity to save
	 * @return the persisted entity
	 */
	@Override
	public PaymentDTO save(PaymentDTO paymentDTO) {
		paymentDTO.setDateAndTime(Instant.now());
		log.debug("Request to save Payment : {}", paymentDTO);
		Payment payment = paymentMapper.toEntity(paymentDTO);
		payment = paymentRepository.save(payment);
		PaymentDTO result = paymentMapper.toDto(payment);
		paymentSearchRepository.save(payment);
	    publishPaymentToKafka(result);
		sendNotification(result);
		return result;
	}

	private void sendNotification(PaymentDTO paymentDTO) {
		NotificationDTO notificationToPayer = new NotificationDTO();
		notificationToPayer.setDate(Instant.now());
		notificationToPayer.setMessage("Dear customer,Your Order Has been placed successfully!");
		notificationToPayer.setTitle("Order Placed");
		notificationToPayer.setTargetId(paymentDTO.getTargetId());
		notificationToPayer.setType("Order-Placed");
		notificationToPayer.setStatus("unread");
		notificationToPayer.setReceiverId(paymentDTO.getPayer());
		NotificationDTO resultNotificationPayer=notificationService.save(notificationToPayer);
		notificationService.publishNotificationToMessageBroker(resultNotificationPayer);
	}

	public void publishPaymentToKafka(PaymentDTO paymentDTO) {
		com.diviso.graeshoppe.payment.avro.Payment payment = com.diviso.graeshoppe.payment.avro.Payment.newBuilder()
				.setId(paymentDTO.getId())
				.setRef(paymentDTO.getRef()).setPayee(paymentDTO.getPayee()).setPayer(paymentDTO.getPayer())
				.setAmount(paymentDTO.getAmount()).setPaymentType(paymentDTO.getPaymentType())
				.setProvider(paymentDTO.getProvider()).setStatus(paymentDTO.getStatus())
				.setTargetId(paymentDTO.getTargetId()).setTax(paymentDTO.getTax()).setTotal(paymentDTO.getTotal())
				.setDateAndTime(paymentDTO.getDateAndTime().getEpochSecond()).build();
		 try {
			messagingService.publishPayment(payment);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Get all the payments.
	 *
	 * @param pageable the pagination information
	 * @return the list of entities
	 */
	@Override
	@Transactional(readOnly = true)
	public Page<PaymentDTO> findAll(Pageable pageable) {
		log.debug("Request to get all Payments");
		return paymentRepository.findAll(pageable).map(paymentMapper::toDto);
	}

	/**
	 * Get one payment by id.
	 *
	 * @param id the id of the entity
	 * @return the entity
	 */
	@Override
	@Transactional(readOnly = true)
	public Optional<PaymentDTO> findOne(Long id) {
		log.debug("Request to get Payment : {}", id);
		return paymentRepository.findById(id).map(paymentMapper::toDto);
	}

	/**
	 * Delete the payment by id.
	 *
	 * @param id the id of the entity
	 */
	@Override
	public void delete(Long id) {
		log.debug("Request to delete Payment : {}", id);
		paymentRepository.deleteById(id);
		paymentSearchRepository.deleteById(id);
	}

	/**
	 * Search for the payment corresponding to the query.
	 *
	 * @param query    the query of the search
	 * @param pageable the pagination information
	 * @return the list of entities
	 */
	@Override
	@Transactional(readOnly = true)
	public Page<PaymentDTO> search(String query, Pageable pageable) {
		log.debug("Request to search for a page of Payments for query {}", query);
		return paymentSearchRepository.search(queryStringQuery(query), pageable).map(paymentMapper::toDto);
	}

	@Override
	public CommandResource processPayment(ProcessPaymentRequest processPaymentRequest) {

		String processInstanceId = tasksApi.getTask(processPaymentRequest.getTaskId()).getBody().getProcessInstanceId();
		log.info("ProcessInstanceId is+ " + processInstanceId);
		SubmitFormRequest formRequest = new SubmitFormRequest();
		List<RestFormProperty> properties = new ArrayList<RestFormProperty>();
		RestFormProperty paymentStatus = new RestFormProperty();
		paymentStatus.setId("paymentStatus");
		paymentStatus.setName("paymentStatus");
		paymentStatus.setType("String");
		paymentStatus.setValue(processPaymentRequest.getPaymentStatus());
		properties.add(paymentStatus);

		formRequest.setProperties(properties);
		formRequest.setAction("completed");
		formRequest.setTaskId(processPaymentRequest.getTaskId());
		formsApi.submitForm(formRequest);
		CommandResource commandResource = resourceAssembler.toResource(processInstanceId);
		return commandResource;
	}

	@Override
	public Optional<PaymentDTO> findByRef(String transactionId) {
		return paymentRepository.findByRef(transactionId).map(paymentMapper::toDto);
	}
}

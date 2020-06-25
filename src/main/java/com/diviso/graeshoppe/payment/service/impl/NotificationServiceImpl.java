package com.diviso.graeshoppe.payment.service.impl;

import com.diviso.graeshoppe.payment.service.KafkaMessagingService;
import com.diviso.graeshoppe.payment.service.NotificationService;
import com.diviso.graeshoppe.notification.avro.Notification.Builder;
import com.diviso.graeshoppe.payment.domain.Notification;
import com.diviso.graeshoppe.payment.repository.NotificationRepository;
import com.diviso.graeshoppe.payment.repository.search.NotificationSearchRepository;
import com.diviso.graeshoppe.payment.service.dto.NotificationDTO;
import com.diviso.graeshoppe.payment.service.mapper.NotificationMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.nio.ByteBuffer;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing {@link Notification}.
 */
@Service
@Transactional
public class NotificationServiceImpl implements NotificationService {

	private final Logger log = LoggerFactory.getLogger(NotificationServiceImpl.class);

	private final NotificationRepository notificationRepository;

	private final NotificationMapper notificationMapper;
	@Autowired
	private KafkaMessagingService messagingService;
	private final NotificationSearchRepository notificationSearchRepository;

	public NotificationServiceImpl(NotificationRepository notificationRepository, NotificationMapper notificationMapper,
			NotificationSearchRepository notificationSearchRepository) {
		this.notificationRepository = notificationRepository;
		this.notificationMapper = notificationMapper;
		this.notificationSearchRepository = notificationSearchRepository;
	}

	/**
	 * Save a notification.
	 *
	 * @param notificationDTO the entity to save.
	 * @return the persisted entity.
	 */
	@Override
	public NotificationDTO save(NotificationDTO notificationDTO) {
		log.debug("Request to save Notification : {}", notificationDTO);
		Notification notification = notificationMapper.toEntity(notificationDTO);
		notification = notificationRepository.save(notification);
		NotificationDTO result = notificationMapper.toDto(notification);
		notificationSearchRepository.save(notification);
		return result;
	}

	/**
	 * Get all the notifications.
	 *
	 * @param pageable the pagination information.
	 * @return the list of entities.
	 */
	@Override
	@Transactional(readOnly = true)
	public Page<NotificationDTO> findAll(Pageable pageable) {
		log.debug("Request to get all Notifications");
		return notificationRepository.findAll(pageable).map(notificationMapper::toDto);
	}

	/**
	 * Get one notification by id.
	 *
	 * @param id the id of the entity.
	 * @return the entity.
	 */
	@Override
	@Transactional(readOnly = true)
	public Optional<NotificationDTO> findOne(Long id) {
		log.debug("Request to get Notification : {}", id);
		return notificationRepository.findById(id).map(notificationMapper::toDto);
	}

	/**
	 * Delete the notification by id.
	 *
	 * @param id the id of the entity.
	 */
	@Override
	public void delete(Long id) {
		log.debug("Request to delete Notification : {}", id);
		notificationRepository.deleteById(id);
		notificationSearchRepository.deleteById(id);
	}

	/**
	 * Search for the notification corresponding to the query.
	 *
	 * @param query    the query of the search.
	 * @param pageable the pagination information.
	 * @return the list of entities.
	 */
	@Override
	@Transactional(readOnly = true)
	public Page<NotificationDTO> search(String query, Pageable pageable) {
		log.debug("Request to search for a page of Notifications for query {}", query);
		return notificationSearchRepository.search(queryStringQuery(query), pageable).map(notificationMapper::toDto);
	}

	@Override
	public void publishNotificationToMessageBroker(NotificationDTO notification) {
		Builder messageBuilder = com.diviso.graeshoppe.notification.avro.Notification.newBuilder()
				.setDate(notification.getDate().toEpochMilli()).setId(notification.getId())
				.setMessage(notification.getMessage()).setTargetId(notification.getTargetId())
				.setReceiverId(notification.getReceiverId()).setType(notification.getType()).setImageLink("")
				.setTitle(notification.getTitle()).setStatus(notification.getStatus());

		try {
			messagingService.publishNotification(messageBuilder.build());
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

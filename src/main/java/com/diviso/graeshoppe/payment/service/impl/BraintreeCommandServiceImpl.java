package com.diviso.graeshoppe.payment.service.impl;

import java.math.BigDecimal;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.ClientTokenRequest;
import com.braintreegateway.Result;
import com.braintreegateway.Transaction;
import com.braintreegateway.TransactionRequest;
import com.braintreegateway.ValidationError;
import com.diviso.graeshoppe.payment.client.braintree.models.PaymentTransaction;
import com.diviso.graeshoppe.payment.client.braintree.models.PaymentTransactionResponse;
import com.diviso.graeshoppe.payment.client.braintree.models.RefundResponse;
import com.diviso.graeshoppe.payment.service.BraintreeCommandService;
import com.diviso.graeshoppe.payment.service.PaymentService;
import com.diviso.graeshoppe.payment.service.dto.PaymentDTO;

@Service
public class BraintreeCommandServiceImpl implements BraintreeCommandService {

	@Autowired
	private BraintreeGateway braintreeGateway;
	private final Logger log = LoggerFactory.getLogger(BraintreeCommandServiceImpl.class);

	@Autowired
	private PaymentService paymentService;

	@Override
	public String getClientToken() {
		ClientTokenRequest clientTokenRequest = new ClientTokenRequest();
		String clientToken = braintreeGateway.clientToken().generate(clientTokenRequest);
		return clientToken;
	}

	@Override
	public PaymentTransactionResponse createTransaction(PaymentTransaction paymentTransaction) {
		TransactionRequest request = new TransactionRequest().amount(new BigDecimal(paymentTransaction.getAmount()))
				.paymentMethodNonce(paymentTransaction.getNounce()).customerId(paymentTransaction.getCustomerId())
				.options().submitForSettlement(true).done();
		Result<Transaction> result = braintreeGateway.transaction().sale(request);
		PaymentTransactionResponse paymentTransactionResponse = new PaymentTransactionResponse();
		if (result.isSuccess()) {
			Transaction transaction = result.getTarget();
			paymentTransactionResponse.setTransactionId(transaction.getId());
			log.info("Success!: " + transaction.getId());
		} else if (result.getTransaction() != null) {
			Transaction transaction = result.getTransaction();
			log.info("Error processing transaction:");
			log.info("  Status: " + transaction.getStatus());
			log.info("  Code: " + transaction.getProcessorResponseCode());
			log.info("  Text: " + transaction.getProcessorResponseText());
		} else {

			for (ValidationError error : result.getErrors().getAllDeepValidationErrors()) {
				log.info("Attribute: " + error.getAttribute());
				log.info("  Code: " + error.getCode());
				log.info("  Message: " + error.getMessage());
			}

		}
		return paymentTransactionResponse;
	}

	@Override
	public RefundResponse createRefund(String transactionId,Double amount) {
		BigDecimal amountToBeRefund =BigDecimal.valueOf(amount);
		Optional<PaymentDTO> payment = paymentService.findByRef(transactionId);
		RefundResponse refundResponse = new RefundResponse();
		if (payment.isPresent()) {
			PaymentDTO data = payment.get();
			if (data.getProvider().equalsIgnoreCase("braintree")) {
				String status = braintreeGateway.transaction().find(data.getRef()).getStatus().name();
				if (status.equalsIgnoreCase("SETTLED")) {
					log.info("Refunding payment is " + data+" amountTobeRefunded "+amountToBeRefund);
					Result<Transaction> result = braintreeGateway.transaction().refund(transactionId,amountToBeRefund);
					log.info("Refund status is "+result.getMessage());
					log.info("result is after refund "+result.getTarget());
					log.info("Result refund is "+result);
					log.info("Result transaction is "+result.getTransaction());
					log.info("RefundId result  is " + result.getTarget().getId());
					refundResponse.setTransactionId(result.getTarget().getId());
					refundResponse.setStatus("completed");
					return refundResponse;
				} else {
					refundResponse.setStatus(status);
					return refundResponse;
				}

			} else {
				return null;
			}
		} else {
			return null;
		}

	}

}

package com.diviso.graeshoppe.payment.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.payment.client.braintree.models.PaymentTransaction;
import com.diviso.graeshoppe.payment.client.braintree.models.PaymentTransactionResponse;
import com.diviso.graeshoppe.payment.client.braintree.models.RefundResponse;
import com.diviso.graeshoppe.payment.service.BraintreeCommandService;

@RestController
@RequestMapping("/api")
public class BraintreeCommandResource {

	@Autowired
	private BraintreeCommandService braintreeService;

	@GetMapping("/clientToken")
	public String createClientAuthToken() {
		return braintreeService.getClientToken();
	}

	@PostMapping("/transaction")
	public ResponseEntity<PaymentTransactionResponse> createTransaction(
			@RequestBody PaymentTransaction paymentTransaction) {
		PaymentTransactionResponse response = braintreeService.createTransaction(paymentTransaction);
		return new ResponseEntity<PaymentTransactionResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping("/refunds/{transactionId}/{amount}")
	public ResponseEntity<RefundResponse> createRefund(@PathVariable String transactionId,@PathVariable Double amount){
		RefundResponse refundResponse = braintreeService.createRefund(transactionId,amount);
		return new ResponseEntity<RefundResponse>(refundResponse, HttpStatus.OK);
	}
}

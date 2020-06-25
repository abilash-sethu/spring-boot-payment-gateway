package com.diviso.graeshoppe.payment.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.payment.client.paypal.models.PaymentDetails;
import com.diviso.graeshoppe.payment.client.paypal.models.PaymentHistory;
import com.diviso.graeshoppe.payment.service.PaypalQueryService;


@RequestMapping("/api")
@RestController
public class PaypalQueryResource {

	
private final Logger log=LoggerFactory.getLogger(PaypalQueryResource.class);
	
	@Autowired
	private PaypalQueryService paypalQueryService;
	
	/*
	 * The method return the list of payments
	 * 
	 * @Return returns the PaymentHistory object
	 */

	@GetMapping("/paypal/payments")
	public PaymentHistory getAllPaymentsFromGateway() {
		return paypalQueryService.getAllPayments();
	}
	
	/*
	 * The method return the specified payment by search using payment id
	 * 
	 * @Param the payment id of the specified payment
	 * 
	 * @Return return the payment object
	 */
	@GetMapping("/payments/paypal/{payment_id}")
	public PaymentDetails getPayment(@PathVariable String payment_id) {
		return paypalQueryService.getPayment(payment_id);
	}
}

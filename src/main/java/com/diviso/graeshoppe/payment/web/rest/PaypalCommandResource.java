package com.diviso.graeshoppe.payment.web.rest;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.payment.client.paypal.models.PaymentExecutionRequest;
import com.diviso.graeshoppe.payment.client.paypal.models.PaymentInitiateRequest;
import com.diviso.graeshoppe.payment.client.paypal.models.PaymentInitiateResponse;
import com.diviso.graeshoppe.payment.client.paypal.models.RefundSaleRequest;
import com.diviso.graeshoppe.payment.service.PaypalCommandService;
import com.paypal.api.payments.Patch;

@RestController
@RequestMapping("/api")
public class PaypalCommandResource {

	private PaypalCommandService paypalCommandService;
	
	/*
	 * The method is used to Initiate a payment using the transaction details
	 * 
	 * @Parm The Payment object to create a simple payment
	 * 
	 * @Return The return object is the PaymenetInitiateResponse that is created
	 */

	public PaypalCommandResource(PaypalCommandService paypalCommandService) {

		this.paypalCommandService=paypalCommandService;
		
	}

	@PostMapping("/payments/paypal/initiate")
	public PaymentInitiateResponse initiatePayment(@RequestBody PaymentInitiateRequest paymentInitiateRequest) {
		return paypalCommandService.initiatePayment(paymentInitiateRequest);
	}

	/*
	 * The method used to execute the created payment
	 * 
	 * @Param payment id of the payment and the payment execution request
	 * 
	 * @Return return type void after updated
	 */
	@PostMapping("/payments/paypal/{payment_id}/execute")
	public void executePayment(@PathVariable String payment_id,
			@RequestBody(required = false) PaymentExecutionRequest paymentExecutionRequest) {
		
		
		paypalCommandService.executePayment(payment_id, paymentExecutionRequest);
	}

	/*
	 * The method used to update the created payment
	 * 
	 * @Param payment id of the payment and the patch request
	 * 
	 * @Return return type void after updated
	 */
	@PatchMapping("/payments/paypal/{payment_id}")
	public void updatePayment(@PathVariable String payment_id, @RequestBody ArrayList<Patch> patchRequest) {
		paypalCommandService.updatePayment(payment_id, patchRequest);
	}

	@PostMapping("/payments/paypal/sale/{sale_id}/refund")
	public void refundSale(@PathVariable String sale_id, @RequestBody RefundSaleRequest refundSaleRequest) {
		paypalCommandService.refundSale(sale_id, refundSaleRequest);
	}

	
	
	
}

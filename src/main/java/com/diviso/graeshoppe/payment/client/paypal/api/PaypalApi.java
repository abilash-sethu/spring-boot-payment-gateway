package com.diviso.graeshoppe.payment.client.paypal.api;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diviso.graeshoppe.payment.client.paypal.models.PaymentDetails;
import com.diviso.graeshoppe.payment.client.paypal.models.PaymentExecutionRequest;
import com.diviso.graeshoppe.payment.client.paypal.models.PaymentHistory;
import com.diviso.graeshoppe.payment.client.paypal.models.PaymentInitiateRequest;
import com.diviso.graeshoppe.payment.client.paypal.models.PaymentInitiateResponse;
import com.diviso.graeshoppe.payment.client.paypal.models.Refund;
import com.diviso.graeshoppe.payment.client.paypal.models.RefundSaleRequest;
import com.paypal.api.payments.Patch;


public interface PaypalApi {
	
	@RequestMapping(value = "/payments/payment", produces = "*/*", consumes = "application/json", method = RequestMethod.POST)
	public PaymentInitiateResponse initiatePayment(@RequestBody PaymentInitiateRequest paymentInitiateRequest);

	@RequestMapping(value = "/payments/payment", produces = "*/*", consumes = "application/json", method = RequestMethod.GET)
	public PaymentHistory getAllPayments();

	@RequestMapping(value = "/payments/payment/{payment_id}", produces = "*/*", consumes = "application/json", method = RequestMethod.GET)
	public PaymentDetails getPayment(@PathVariable(value = "payment_id") String payment_id);

	@RequestMapping(value = "/payments/payment/{payment_id}", produces = "*/*", consumes = "application/json", method = RequestMethod.PATCH)
	public void updatePayment(@PathVariable(value = "payment_id") String payment_id,
			@RequestBody ArrayList<Patch> patchRequest);

	@RequestMapping(value = "/payments/payment/{payment_id}/execute" + 
			"", produces = "*/*", consumes = "application/json", method = RequestMethod.POST)
	public PaymentDetails executePayment(@PathVariable(value="payment_id") String payment_id, @RequestBody(required=false) PaymentExecutionRequest paymentExecution);
	
	@RequestMapping(value="/payments/sale/{sale_id}/refund",produces="*/*",consumes="application/json",method=RequestMethod.POST)
	public Refund refundSale(@PathVariable("sale_id") String sale_id,@RequestBody RefundSaleRequest refundSaleRequest);
}

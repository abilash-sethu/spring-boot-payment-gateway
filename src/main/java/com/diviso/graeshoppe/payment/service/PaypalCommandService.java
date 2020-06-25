package com.diviso.graeshoppe.payment.service;

import java.util.ArrayList;

import com.diviso.graeshoppe.payment.client.paypal.models.PaymentExecutionRequest;
import com.diviso.graeshoppe.payment.client.paypal.models.PaymentInitiateRequest;
import com.diviso.graeshoppe.payment.client.paypal.models.PaymentInitiateResponse;
import com.diviso.graeshoppe.payment.client.paypal.models.RefundSaleRequest;
import com.paypal.api.payments.Patch;

public interface PaypalCommandService {

	
	PaymentInitiateResponse initiatePayment(PaymentInitiateRequest paymentInitiateRequest);

	void updatePayment(String payment_id, ArrayList<Patch> patchRequest);

	void executePayment(String payment_id, PaymentExecutionRequest paymentExecution);

	void refundSale(String sale_id, RefundSaleRequest refundSaleRequest);
}

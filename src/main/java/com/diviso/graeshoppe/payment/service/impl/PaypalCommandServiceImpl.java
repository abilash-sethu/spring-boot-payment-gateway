package com.diviso.graeshoppe.payment.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.payment.client.paypal.api.PaypalApi;
import com.diviso.graeshoppe.payment.client.paypal.models.PaymentExecutionRequest;
import com.diviso.graeshoppe.payment.client.paypal.models.PaymentInitiateRequest;
import com.diviso.graeshoppe.payment.client.paypal.models.PaymentInitiateResponse;
import com.diviso.graeshoppe.payment.client.paypal.models.RefundSaleRequest;
import com.diviso.graeshoppe.payment.service.PaypalCommandService;
import com.paypal.api.payments.Patch;

@Service
public class PaypalCommandServiceImpl implements PaypalCommandService{

	@Autowired
	private PaypalApi paypalAPI;
	
	
	@Override
	public PaymentInitiateResponse initiatePayment(PaymentInitiateRequest paymentInitiateRequest) {
		return paypalAPI.initiatePayment(paymentInitiateRequest);
	}

	@Override
	public void updatePayment(String payment_id, ArrayList<Patch> patchRequest) {
		paypalAPI.updatePayment(payment_id, patchRequest);
		
	}

	@Override
	public void executePayment(String payment_id, PaymentExecutionRequest paymentExecution) {
		paypalAPI.executePayment(payment_id, paymentExecution);
	}

	@Override
	public void refundSale(String sale_id, RefundSaleRequest refundSaleRequest) {

		paypalAPI.refundSale(sale_id, refundSaleRequest);
	}

}

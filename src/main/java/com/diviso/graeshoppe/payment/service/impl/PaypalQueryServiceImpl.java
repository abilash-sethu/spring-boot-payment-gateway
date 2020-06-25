package com.diviso.graeshoppe.payment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.payment.client.paypal.api.PaypalApi;
import com.diviso.graeshoppe.payment.client.paypal.models.PaymentDetails;
import com.diviso.graeshoppe.payment.client.paypal.models.PaymentHistory;
import com.diviso.graeshoppe.payment.service.PaypalQueryService;

@Service
public class PaypalQueryServiceImpl implements PaypalQueryService{

	@Autowired
	private PaypalApi paypalAPI;
	
	@Override
	public PaymentHistory getAllPayments() {
		return paypalAPI.getAllPayments();
	}

	@Override
	public PaymentDetails getPayment(String payment_id) {
		return paypalAPI.getPayment(payment_id);
	}

}

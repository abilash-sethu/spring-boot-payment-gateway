package com.diviso.graeshoppe.payment.service;

import com.diviso.graeshoppe.payment.client.paypal.models.PaymentDetails;
import com.diviso.graeshoppe.payment.client.paypal.models.PaymentHistory;

public interface PaypalQueryService {

	
	
	PaymentHistory getAllPayments();
	
	PaymentDetails getPayment(String payment_id );
}

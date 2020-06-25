package com.diviso.graeshoppe.payment.service;

import java.util.Optional;

import com.diviso.graeshoppe.payment.client.razorpay.model.OrderRequest;
import com.diviso.graeshoppe.payment.client.razorpay.model.OrderResponse;

public interface RazorpayCommandService {

	
	public Optional<OrderResponse> createOrder(OrderRequest orderRequest);
}

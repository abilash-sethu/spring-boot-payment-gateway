package com.diviso.graeshoppe.payment.client.razorpay.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diviso.graeshoppe.payment.client.razorpay.model.OrderRequest;
import com.diviso.graeshoppe.payment.client.razorpay.model.OrderResponse;

public interface RazorpayApi  {

		@RequestMapping(value = "/orders", produces = "*/*", consumes = "application/json", method = RequestMethod.POST)
		public OrderResponse createOrder(@RequestBody OrderRequest orderRequest);
	
	
}

package com.diviso.graeshoppe.payment.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.payment.client.razorpay.model.OrderRequest;
import com.diviso.graeshoppe.payment.client.razorpay.model.OrderResponse;
import com.diviso.graeshoppe.payment.service.RazorpayCommandService;

@RequestMapping("/api")
@RestController
public class RazorpayCommandResource {

	@Autowired
	private RazorpayCommandService razorpayCommandService;
	
	@PostMapping("/payments/razorpay/create")
	public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest orderRequest) {
		
		return ResponseEntity.ok(razorpayCommandService.createOrder(orderRequest).get());
	}
}

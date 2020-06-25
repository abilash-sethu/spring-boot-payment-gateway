package com.diviso.graeshoppe.payment.service.impl;

import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.payment.client.razorpay.api.RazorpayApi;
import com.diviso.graeshoppe.payment.client.razorpay.model.OrderRequest;
import com.diviso.graeshoppe.payment.client.razorpay.model.OrderResponse;
import com.diviso.graeshoppe.payment.service.RazorpayCommandService;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Service
public class RazorpayCommandServiceImpl implements RazorpayCommandService {

	@Autowired
	private RazorpayApi razorPayApi;

	@Value("${razorPay.security.basicAuth.key}")
	private String razorPayKey;
	
	@Value("${razorPay.security.basicAuth.secret}")
	private String razorPaySecret;
	
	@Override
	public Optional<OrderResponse> createOrder(OrderRequest orderRequest) {
		OrderResponse orderResponse=new OrderResponse();
		 try {
			RazorpayClient razorpayClient = new RazorpayClient(razorPayKey, razorPaySecret);
				JSONObject request=new JSONObject();
				request.put("amount", orderRequest.getAmount()); // Note: The amount should be in paise.
				request.put("currency", orderRequest.getCurrency());
				request.put("receipt", orderRequest.getReceipt());
				request.put("payment_capture", orderRequest.getPayment_capture());
				Order order=razorpayClient.Orders.create(request);
				orderResponse.setId(order.get("id"));
				orderResponse.setEntity(order.get("entity"));
				orderResponse.setAmount(order.get("amount"));
				orderResponse.setAmount_paid(order.get("amount_paid"));
				orderResponse.setAmount_due(order.get("amount_due"));
				orderResponse.setCurrency(order.get("currency"));
				orderResponse.setReceipt(order.get("receipt"));
				//orderResponse.setOffer_id(order.get("offer_id"));
				orderResponse.setStatus(order.get("status"));
				orderResponse.setAttempts(order.get("attempts"));
				//orderResponse.setNotes(order.get("notes"));
				orderResponse.setCreated_at(order.get("created_at"));
				System.out.println("Order response is ++++++++++++++++++++++++++++++++++++++++++++++++++++++"+order);
		 } catch (RazorpayException e) {

			e.printStackTrace();
		}

		
		
		return Optional.of(orderResponse);
	}

}

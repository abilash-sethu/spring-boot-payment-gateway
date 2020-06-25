package com.diviso.graeshoppe.payment.client.razorpay.api;

import org.springframework.cloud.openfeign.FeignClient;

import com.diviso.graeshoppe.payment.client.razorpay.RazorpayClientConfiguration;

@FeignClient(name = "razorpay", url = "${razorpay.url:https://api.razorpay.com/v1}", configuration = RazorpayClientConfiguration.class)
public interface RazorpayApiClient extends RazorpayApi {

}

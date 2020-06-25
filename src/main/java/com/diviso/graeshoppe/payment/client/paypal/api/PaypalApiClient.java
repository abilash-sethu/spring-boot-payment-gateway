package com.diviso.graeshoppe.payment.client.paypal.api;



import org.springframework.cloud.openfeign.FeignClient;

import com.diviso.graeshoppe.payment.client.paypal.ClientConfiguration;



@FeignClient(name = "paypal", url = "${paypal.url:https://api.sandbox.paypal.com/v1}", configuration = ClientConfiguration.class)
public interface PaypalApiClient extends PaypalApi {

	
}
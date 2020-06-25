package com.diviso.graeshoppe.payment.client.braintree.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.Environment;

@Configuration
public class BraintreeConfiguration {

	@Value("${braintree.merchantId}")
	private String merchantId;
	@Value("${braintree.publicKey}")
	private String publicKey;
	@Value("${braintree.privateKey}")
	private String privateKey;
	@Value("${braintree.environment}")
	private String environment;

	@Bean
	public BraintreeGateway getBraintreeGateway() {
		Environment environ = null;
		if (environment.equals("sandbox")) {
			environ = Environment.SANDBOX;
		} else if (environment.equals("development")) {
			environ = Environment.DEVELOPMENT;
		} else if (environment.equals("production")) {
			environ = Environment.PRODUCTION;
		}
		BraintreeGateway gateway = new BraintreeGateway(environ, merchantId, publicKey, privateKey);
		return gateway;
	}
}

package com.diviso.graeshoppe.payment.client.razorpay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.diviso.graeshoppe.payment.client.ExcludeFromComponentScan;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;

@Configuration
@ExcludeFromComponentScan
public class RazorpayClientConfiguration {

	@Value("${razorPay.security.basicAuth.key}")
	private String key;

	@Value("${razorPay.security.basicAuth.secret}")
	private String secret;


	 @Bean
	  @ConditionalOnProperty(name = "razorPay.security.basicAuth.key")
	  public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
		  System.out.println("Key is "+key+" Secret is "+secret);
	    return new BasicAuthRequestInterceptor(this.key, this.secret);
	  }

	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}
}

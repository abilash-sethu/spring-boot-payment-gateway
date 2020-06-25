package com.diviso.graeshoppe.payment.client.paypal.models;

import java.util.List;

import com.paypal.api.payments.Links;


public class PaymentInitiateResponse {

	private String id;
	private String state;
	private String create_time;
	private List<Links> links;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public List<Links> getLinks() {
		return links;
	}
	public void setLinks(List<Links> links) {
		this.links = links;
	}
}

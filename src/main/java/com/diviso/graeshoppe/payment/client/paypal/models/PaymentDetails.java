package com.diviso.graeshoppe.payment.client.paypal.models;

import java.util.List;

import com.paypal.api.payments.Links;



public class PaymentDetails {

	
	/**
	 * ID of the created payment, the 'transaction ID'
	 */
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public Payer getPayer() {
		return payer;
	}

	public void setPayer(Payer payer) {
		this.payer = payer;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public List<Links> getLinks() {
		return links;
	}

	public void setLinks(List<Links> links) {
		this.links = links;
	}

	/**
	 * Payment creation time as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	 */
	private String create_time;

	/**
	 * Payment update time as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6).
	 */
	private String update_time;
	
	/**
	 * Payment state.
	 */
	private String state;
	/**
	 * Payment intent.
	 */
	private String intent;

	/**
	 * Source of the funds for this payment represented by a PayPal account or a direct credit card.
	 */
	private Payer payer;

	/**
	 * Transactional details including the amount and item details.
	 */
	private List<Transaction> transactions;
	
	/**
	 * links
	 */
	private List<Links> links;

}

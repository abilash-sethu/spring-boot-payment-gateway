package com.diviso.graeshoppe.payment.client.paypal.models;

import java.util.List;


public class PaymentInitiateRequest {
	private String id;
	private String intent;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getNote_to_payer() {
		return note_to_payer;
	}
	public void setNote_to_payer(String note_to_payer) {
		this.note_to_payer = note_to_payer;
	}
	public Link getRedirect_urls() {
		return redirect_urls;
	}
	public void setRedirect_urls(Link redirect_urls) {
		this.redirect_urls = redirect_urls;
	}
	private Payer payer;
	private List<Transaction> transactions;
	private String state;
	private String note_to_payer;
	private Link redirect_urls ;

}

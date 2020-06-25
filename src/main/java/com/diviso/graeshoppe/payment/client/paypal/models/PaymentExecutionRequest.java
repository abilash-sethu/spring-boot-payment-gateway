package com.diviso.graeshoppe.payment.client.paypal.models;

import java.util.List;


public class PaymentExecutionRequest {

	private String payer_id;
	
	private List<Transaction> transactions;

	public String getPayer_id() {
		return payer_id;
	}

	public void setPayer_id(String payer_id) {
		this.payer_id = payer_id;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
}

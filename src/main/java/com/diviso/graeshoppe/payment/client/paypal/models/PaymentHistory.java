package com.diviso.graeshoppe.payment.client.paypal.models;

import java.util.List;

public class PaymentHistory {
	private List<PaymentDetails> payments;
	private int count;
	private String nextId;
	public List<PaymentDetails> getPayments() {
		return payments;
	}
	public void setPayments(List<PaymentDetails> payments) {
		this.payments = payments;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getNextId() {
		return nextId;
	}
	public void setNextId(String nextId) {
		this.nextId = nextId;
	}
}

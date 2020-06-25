package com.diviso.graeshoppe.payment.client.paypal.models;

public class RelatedResources {

	private Sale sale;
	public Sale getSale() {
		return sale;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	public Refund getRefund() {
		return refund;
	}
	public void setRefund(Refund refund) {
		this.refund = refund;
	}
	private Refund refund;
}

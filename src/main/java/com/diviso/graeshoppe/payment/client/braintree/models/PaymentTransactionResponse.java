package com.diviso.graeshoppe.payment.client.braintree.models;

public class PaymentTransactionResponse {

	@Override
	public String toString() {
		return String.format("PaymentTransactionResponse [transactionId=%s]", transactionId);
	}

	private String transactionId;

	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
}

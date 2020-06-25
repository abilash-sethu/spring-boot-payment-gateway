package com.diviso.graeshoppe.payment.client.braintree.models;

public class RefundResponse {

	private String transactionId;

	private String status;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return String.format("RefundResponse [transactionId=%s,\n status=%s]", transactionId, status);
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

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

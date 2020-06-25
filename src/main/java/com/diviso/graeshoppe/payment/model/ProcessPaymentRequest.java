package com.diviso.graeshoppe.payment.model;

public class ProcessPaymentRequest {

	private String paymentStatus;
	
	@Override
	public String toString() {
		return String.format("ProcessPaymentRequest [paymentStatus=%s,\n taskId=%s]", paymentStatus, taskId);
	}

	/**
	 * @return the paymentStatus
	 */
	public String getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * @param paymentStatus the paymentStatus to set
	 */
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	/**
	 * @return the taskId
	 */
	public String getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	private String taskId;
}

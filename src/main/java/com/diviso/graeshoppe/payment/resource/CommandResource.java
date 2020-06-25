package com.diviso.graeshoppe.payment.resource;

public class CommandResource {
	
	private String nextTaskId;
	private String nextTaskName;
	private String orderId;
	private Long selfId;
	/**
	 * @return the nextTaskId
	 */
	public String getNextTaskId() {
		return nextTaskId;
	}
	/**
	 * @return the selfId
	 */
	public Long getSelfId() {
		return selfId;
	}
	/**
	 * @param selfId the selfId to set
	 */
	public void setSelfId(Long selfId) {
		this.selfId = selfId;
	}
	@Override
	public String toString() {
		return String.format("CommandResource [nextTaskId=%s,\n nextTaskName=%s,\n orderId=%s]", nextTaskId,
				nextTaskName, orderId);
	}
	/**
	 * @param nextTaskId the nextTaskId to set
	 */
	public void setNextTaskId(String nextTaskId) {
		this.nextTaskId = nextTaskId;
	}
	/**
	 * @return the nextTaskName
	 */
	public String getNextTaskName() {
		return nextTaskName;
	}
	/**
	 * @param nextTaskName the nextTaskName to set
	 */
	public void setNextTaskName(String nextTaskName) {
		this.nextTaskName = nextTaskName;
	}
	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}

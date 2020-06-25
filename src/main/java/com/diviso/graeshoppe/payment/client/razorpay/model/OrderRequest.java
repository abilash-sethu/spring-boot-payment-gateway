package com.diviso.graeshoppe.payment.client.razorpay.model;

public class OrderRequest {

	
	private Double amount;
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}
	@Override
	public String toString() {
		return String.format("OrderRequest [amount=%s,\n currency=%s,\n receipt=%s,\n payment_capture=%s]", amount,
				currency, receipt, payment_capture);
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the receipt
	 */
	public String getReceipt() {
		return receipt;
	}
	/**
	 * @param receipt the receipt to set
	 */
	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}
	/**
	 * @return the payment_capture
	 */
	public Integer getPayment_capture() {
		return payment_capture;
	}
	/**
	 * @param payment_capture the payment_capture to set
	 */
	public void setPayment_capture(Integer payment_capture) {
		this.payment_capture = payment_capture;
	}
	private String currency;
	private String receipt;
	private Integer payment_capture;
}

package com.diviso.graeshoppe.payment.client.braintree.models;

public class PaymentTransaction {

	@Override
	public String toString() {
		return String.format(
				"PaymentTransaction [nounce=%s,\n customerId=%s,\n amount=%s,\n getNounce()=%s,\n getCustomerId()=%s,\n getAmount()=%s,\n getClass()=%s,\n hashCode()=%s,\n toString()=%s]",
				nounce, customerId, amount, getNounce(), getCustomerId(), getAmount(), getClass(), hashCode(),
				super.toString());
	}
	/**
	 * @return the nounce
	 */
	public String getNounce() {
		return nounce;
	}
	/**
	 * @param nounce the nounce to set
	 */
	public void setNounce(String nounce) {
		this.nounce = nounce;
	}
	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	private String nounce;
	private String customerId;
	private Double amount; 
}

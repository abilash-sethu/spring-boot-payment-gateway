package com.diviso.graeshoppe.payment.client.paypal.models;


public class Sale {

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public String getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}

	public String getParent_payment() {
		return parent_payment;
	}

	public void setParent_payment(String parent_payment) {
		this.parent_payment = parent_payment;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	/**
	 * ID of the sale transaction.
	 */
	private String id;


	/**
	 * Amount being collected.
	 */
	private Amount amount;

	/**
	 * Specifies payment mode of the transaction. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String payment_mode;

	/**
	 * State of the sale.
	 */
	private String state;

	/**
	 * Reason code for the transaction state being Pending or Reversed. Only supported when the `payment_method` is set to `paypal`.
	 */
	private String reasonCode;

	/**
	 * Receipt id is a payment identification number returned for guest users to identify the payment.
	 */
	private String receiptId;

	/**
	 * ID of the payment resource on which this transaction is based.
	 */
	private String parent_payment;


	/**
	 * Time of sale as defined in [RFC 3339 Section 5.6](http://tools.ietf.org/html/rfc3339#section-5.6)
	 */
	private String create_time;

	/**
	 * Time the resource was last updated in UTC ISO8601 format.
	 */
	private String update_time;

}

package com.diviso.graeshoppe.payment.client.paypal.models;


public class Refund {

	private String id;
	private Amount amount;
	private String create_time;
	private String update_time;
	private String parent_payment;
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
	public String getParent_payment() {
		return parent_payment;
	}
	public void setParent_payment(String parent_payment) {
		this.parent_payment = parent_payment;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSale_id() {
		return sale_id;
	}
	public void setSale_id(String sale_id) {
		this.sale_id = sale_id;
	}
	public String getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(String invoice_number) {
		this.invoice_number = invoice_number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	private String state;
	private String sale_id;
	private String invoice_number;
	private String description;
	private String reason;
	
}

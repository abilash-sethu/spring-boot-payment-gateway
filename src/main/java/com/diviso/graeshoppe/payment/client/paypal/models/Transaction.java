package com.diviso.graeshoppe.payment.client.paypal.models;

import java.util.List;




public class Transaction {

	private Amount amount;
	private Payee payee;
	private String description;
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	public Payee getPayee() {
		return payee;
	}
	public void setPayee(Payee payee) {
		this.payee = payee;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNote_to_payee() {
		return note_to_payee;
	}
	public void setNote_to_payee(String note_to_payee) {
		this.note_to_payee = note_to_payee;
	}
	public String getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(String invoice_number) {
		this.invoice_number = invoice_number;
	}
	public List<RelatedResources> getRelated_resources() {
		return related_resources;
	}
	public void setRelated_resources(List<RelatedResources> related_resources) {
		this.related_resources = related_resources;
	}
	private String note_to_payee;
	private String invoice_number;
	private List<RelatedResources> related_resources;

}

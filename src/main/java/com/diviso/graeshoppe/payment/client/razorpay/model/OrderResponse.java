package com.diviso.graeshoppe.payment.client.razorpay.model;

import java.util.Arrays;
import java.util.Date;

public class OrderResponse {

	
	private String id;
    private String entity;
    private Integer amount;
    private Integer amount_paid;
    private Integer amount_due;
    private String currency;
    private String receipt;
    private String offer_id;
    private String status;
    /**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return String.format(
				"OrderResponse [id=%s,\n entity=%s,\n amount=%s,\n amount_paid=%s,\n amount_due=%s,\n currency=%s,\n receipt=%s,\n offer_id=%s,\n status=%s,\n attempts=%s,\n notes=%s,\n created_at=%s]",
				id, entity, amount, amount_paid, amount_due, currency, receipt, offer_id, status, attempts,
				Arrays.toString(notes), created_at);
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the entity
	 */
	public String getEntity() {
		return entity;
	}
	/**
	 * @param entity the entity to set
	 */
	public void setEntity(String entity) {
		this.entity = entity;
	}
	/**
	 * @return the amount
	 */
	public Integer getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	/**
	 * @return the amount_paid
	 */
	public Integer getAmount_paid() {
		return amount_paid;
	}
	/**
	 * @param amount_paid the amount_paid to set
	 */
	public void setAmount_paid(Integer amount_paid) {
		this.amount_paid = amount_paid;
	}
	/**
	 * @return the amount_due
	 */
	public Integer getAmount_due() {
		return amount_due;
	}
	/**
	 * @param amount_due the amount_due to set
	 */
	public void setAmount_due(Integer amount_due) {
		this.amount_due = amount_due;
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
	 * @return the offer_id
	 */
	public String getOffer_id() {
		return offer_id;
	}
	/**
	 * @param offer_id the offer_id to set
	 */
	public void setOffer_id(String offer_id) {
		this.offer_id = offer_id;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the attempts
	 */
	public Integer getAttempts() {
		return attempts;
	}
	/**
	 * @param attempts the attempts to set
	 */
	public void setAttempts(Integer attempts) {
		this.attempts = attempts;
	}
	/**
	 * @return the notes
	 */
	public String[] getNotes() {
		return notes;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String[] notes) {
		this.notes = notes;
	}
	/**
	 * @return the created_at
	 */
	public Date getCreated_at() {
		return created_at;
	}
	/**
	 * @param created_at the created_at to set
	 */
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	private Integer attempts;
   
	private String[] notes;
    private Date created_at;
	
}

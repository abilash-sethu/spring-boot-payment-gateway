package com.diviso.graeshoppe.payment.client.paypal.models;




public class PayerInfo {
	private String  userId;
	/**
	 * PayPal assigned encrypted Payer ID.
	 */
	private String payer_id;

	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPayer_id() {
		return payer_id;
	}


	public void setPayer_id(String payer_id) {
		this.payer_id = payer_id;
	}


	public String getCountry_code() {
		return country_code;
	}


	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	/**
	 * Two-letter registered country code of the payer to identify the buyer country.
	 */
	private String country_code;
	 
	private String email;

	/**
	 * Account Number representing the Payer
	 */
	private String accountNumber;

	/**
	 * First name of the payer.
	 */
	private String first_name;

	/**
	 * Middle name of the payer.
	 */
	private String last_name;


	/**
	 * Phone number representing the payer. 20 characters max.
	 */
	private String phone;




}

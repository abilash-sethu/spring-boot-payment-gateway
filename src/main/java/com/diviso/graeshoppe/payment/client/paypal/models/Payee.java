package com.diviso.graeshoppe.payment.client.paypal.models;


public class Payee {
	/**
	 * Email Address associated with the Payee's PayPal Account. If the provided
	 * email address is not associated with any PayPal Account, the payee can only
	 * receiver PayPal Wallet Payments. Direct Credit Card Payments will be denied
	 * due to card compliance requirements.
	 */
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMerchant_id() {
		return merchant_id;
	}

	public void setMerchant_id(String merchant_id) {
		this.merchant_id = merchant_id;
	}

	/**
	 * Encrypted PayPal account identifier for the Payee.
	 */
	private String merchant_id;

	//private String accountNumber;

	//private PayeeDisplayMetaData payee_display_metadata;

}

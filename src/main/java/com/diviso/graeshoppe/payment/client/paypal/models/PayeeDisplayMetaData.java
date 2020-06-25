package com.diviso.graeshoppe.payment.client.paypal.models;

import com.paypal.api.payments.Phone;


public class PayeeDisplayMetaData {
	/**
	 * First Name of the Payee.
	 */
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Phone getDisplay_phone() {
		return display_phone;
	}

	public void setDisplay_phone(Phone display_phone) {
		this.display_phone = display_phone;
	}

	/**
	 * Last Name of the Payee.
	 */
	private String lastName;

	/**
	 * Unencrypted PayPal account Number of the Payee
	 */

	private Phone display_phone;
}

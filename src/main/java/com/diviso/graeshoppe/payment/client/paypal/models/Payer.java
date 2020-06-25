package com.diviso.graeshoppe.payment.client.paypal.models;


import java.util.List;



public class Payer {

	private String payment_method;

	private String status;  //verfied or not

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public PayerInfo getPayer_info() {
		return payer_info;
	}

	public void setPayer_info(PayerInfo payer_info) {
		this.payer_info = payer_info;
	}

	public List<FundingInstrument> getFunding_instruments() {
		return funding_instruments;
	}

	public void setFunding_instruments(List<FundingInstrument> funding_instruments) {
		this.funding_instruments = funding_instruments;
	}

	private PayerInfo payer_info;

	/**
	 * Type of account relationship payer has with PayPal.
	 *//*
	private String accountType;

	*//**
	 * Duration since the payer established account relationship with PayPal in days.
	 *//*
	private String accountAge;

	*//**
	 * List of funding instruments to fund the payment. 'OneOf' funding_instruments,funding_option_id to be used to identify the specifics of payment method passed.
	 */
	private List<FundingInstrument> funding_instruments;

	/**
	 * Id of user selected funding option for the payment.'OneOf' funding_instruments,funding_option_id to be used to identify the specifics of payment method passed.
	 *//*
	private String fundingOptionId;

	*//**
	 * Default funding option available for the payment 
	 *//*
	private FundingOption fundingOption;

	*//**
	 * Funding option related to default funding option.
	 *//*
	private FundingOption relatedFundingOption;

	*/


}

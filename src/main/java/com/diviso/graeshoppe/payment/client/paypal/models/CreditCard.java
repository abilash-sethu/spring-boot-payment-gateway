package com.diviso.graeshoppe.payment.client.paypal.models;

public class CreditCard {

	private String number;
	private Integer expireMonth;
	private Integer expireYear;
	private Integer cvv2;
	private String type;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Integer getExpireMonth() {
		return expireMonth;
	}
	public void setExpireMonth(Integer expireMonth) {
		this.expireMonth = expireMonth;
	}
	public Integer getExpireYear() {
		return expireYear;
	}
	public void setExpireYear(Integer expireYear) {
		this.expireYear = expireYear;
	}
	public Integer getCvv2() {
		return cvv2;
	}
	public void setCvv2(Integer cvv2) {
		this.cvv2 = cvv2;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}

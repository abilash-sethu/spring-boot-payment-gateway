package com.diviso.graeshoppe.payment.client.paypal.models;


public class Link {
private String return_url;
private String cancel_url;
public String getReturn_url() {
	return return_url;
}
public void setReturn_url(String return_url) {
	this.return_url = return_url;
}
public String getCancel_url() {
	return cancel_url;
}
public void setCancel_url(String cancel_url) {
	this.cancel_url = cancel_url;
}


}

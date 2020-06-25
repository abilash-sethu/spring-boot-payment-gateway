package com.diviso.graeshoppe.payment.client.paypal.models;

import java.util.List;

public class ItemList {

	private List<Item> items;
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public ShippingAddress getShipping_address() {
		return shipping_address;
	}
	public void setShipping_address(ShippingAddress shipping_address) {
		this.shipping_address = shipping_address;
	}
	private ShippingAddress shipping_address;

}

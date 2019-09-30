package com.tworks.entity;

import java.util.List;

public class Cart {
	private List<Item> items;
	private Amount amount;
	
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public Cart(List<Item> items) {
		this.items = items;
	}
	
	public Amount getAmount() {
		return amount;
	}
	
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
}

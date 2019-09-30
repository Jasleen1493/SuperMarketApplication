package com.tworks.entity;

public class Customer {
	private String name;
	private Cart cart;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Cart getCart() {
		return cart;
	}
	
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	public Customer(String name, Cart cart) {
		this.name = name;
		this.cart = cart;
	}
}

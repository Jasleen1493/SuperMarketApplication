package com.tworks.entity;

public class Category {
	private String name;
	private Discount discount;
	
	public Category(String name, Discount discount) {
		this.name = name;
		this.discount = discount;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Discount getDiscount() {
		return discount;
	}
	
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
}

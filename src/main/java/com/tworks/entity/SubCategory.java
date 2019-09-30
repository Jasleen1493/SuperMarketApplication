package com.tworks.entity;

public class SubCategory extends Category {
	private String name;
	private Discount discount;
	
	public SubCategory(String name, Discount discount) {
		super(name,discount);
	}
	
	@Override
	public Discount getDiscount() {
		return discount;
	}
	
	@Override
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
	public SubCategory(String name, Discount discount, String name1, Discount discount1) {
		super(name, discount);
		this.name = name1;
		this.discount = discount1;
	}
}

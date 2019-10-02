package com.tworks.entity;

public class SubCategory{
	private String name;
	private Discount discount;
	private Category parentCategory;
	
	public Discount getDiscount() {
		return discount;
	}
	
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
	public SubCategory(String name, Discount discount,Category parentCategory){
		this.name = name;
		this.discount = discount;
		this.parentCategory = parentCategory;
	}
}

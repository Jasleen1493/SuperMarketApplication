package com.tworks.entity;

public class Category {
	private String name;
	private Discount discount;
	private Category parentCategory = null;
	
	public Category(String name, Discount discount, Category parentCategory) {
		this.name = name;
		this.discount = discount;
		this.parentCategory = parentCategory;
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
	
	public Category getParentCategory() {
		return parentCategory;
	}
	
	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}
}

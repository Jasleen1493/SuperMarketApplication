package com.tworks.entity;

public class SubCategory extends Category {
	private String name;
	private Discount discount;
	private Category parentCategory;
	
	public SubCategory(String name, Discount discount,Category parentCategory) {
		super(name,discount,parentCategory);
	}
	
	@Override
	public Discount getDiscount() {
		return discount;
	}
	
	@Override
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
	public SubCategory(String name, Discount discount,Category parentCategory, String name1, Discount discount1,Category parentCategory1) {
		super(name, discount,parentCategory);
		this.name = name1;
		this.discount = discount1;
		this.parentCategory = parentCategory1;
	}
}

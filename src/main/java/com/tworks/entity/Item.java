package com.tworks.entity;

public class Item extends SubCategory{
	private String name;
	private double pricePerUnit;
	private double quantity;
	private String sellingUnit;
	private Discount discount;
	private Category parentCategory;
	
	public Item(String name, Discount discount, String name1, double pricePerUnit, double quantity, String sellingUnit, Discount discount1, Category parentCategory) {
		super(name, discount);
		this.name = name1;
		this.pricePerUnit = pricePerUnit;
		this.quantity = quantity;
		this.sellingUnit = sellingUnit;
		this.discount = discount1;
		this.parentCategory = parentCategory;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	public String getSellingUnit() {
		return sellingUnit;
	}
	
	public void setSellingUnit(String sellingUnit) {
		this.sellingUnit = sellingUnit;
	}
	
	@Override
	public Discount getDiscount() {
		return discount;
	}
	
	@Override
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

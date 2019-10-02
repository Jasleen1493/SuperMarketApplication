package com.tworks.entity;

public class Item{
	private String name;
	private double pricePerUnit;
	private Quantity quantity;
	private Discount discount;
	private SubCategory parentCategory;
	
	public Item(String name1, double pricePerUnit, Quantity quantity, Discount discount1, SubCategory parentCategory1) {
		this.name = name1;
		this.pricePerUnit = pricePerUnit;
		this.quantity = quantity;
		this.discount = discount1;
		this.parentCategory = parentCategory1;
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
	
	public Quantity getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Quantity quantity) {
		this.quantity = quantity;
	}
	
	public Discount getDiscount() {
		return discount;
	}
	
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
	public SubCategory getParentCategory() {
		return parentCategory;
	}
	
	public void setParentCategory(SubCategory parentCategory) {
		this.parentCategory = parentCategory;
	}
}

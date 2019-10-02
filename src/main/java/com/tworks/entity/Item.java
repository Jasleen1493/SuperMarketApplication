package com.tworks.entity;

public class Item{
	private String name;
	private double pricePerUnit;
	private Quantity quantity;
	private Category parentCategory;
	
	public Item(String name, double pricePerUnit, Quantity quantity, Category parentCategory) {
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.quantity = quantity;
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
	
	public Quantity getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Quantity quantity) {
		this.quantity = quantity;
	}
	
	public Category getParentCategory() {
		return parentCategory;
	}
	
	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}
}

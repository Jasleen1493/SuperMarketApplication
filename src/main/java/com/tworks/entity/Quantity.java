package com.tworks.entity;

public class Quantity {
	private double value;
	private String sellingUnit;
	
	public Quantity(double value, String sellingUnit) {
		this.value = value;
		this.sellingUnit = sellingUnit;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public String  getSellingUnit() {
		return sellingUnit;
	}
	
	public void setSellingUnit(String sellingUnit) {
		this.sellingUnit = sellingUnit;
	}
}

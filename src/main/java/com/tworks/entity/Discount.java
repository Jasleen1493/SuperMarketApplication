package com.tworks.entity;

public class Discount {
	private double value;
	private String offer;
	
	public Discount(double value, String offer) {
		this.value = value;
		this.offer = offer;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public String getOffer() {
		return offer;
	}
	
	public void setOffer(String offer) {
		this.offer = offer;
	}
}

package com.tworks.entity;

public class Amount {
private double totalAmount;
private double savedAmount;
private Discount discount;
	
	public double getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public double getSavedAmount() {
		return savedAmount;
	}
	
	public void setSavedAmount(double savedAmount) {
		this.savedAmount = savedAmount;
	}
	
	public Discount getDiscount() {
		return discount;
	}
	
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
}

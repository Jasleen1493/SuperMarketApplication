package com.tworks.service;

import com.tworks.entity.Item;

public class AmountService {
	private DiscountService discountService;
	
	public DiscountService getDiscountService() {
		return discountService;
	}
	
	public void setDiscountService(DiscountService discountService) {
		this.discountService = discountService;
	}
	
	public double getDiscountOnItem(Item item) {
		return getDiscountService().calculateDiscount(item);
	}
	
	public double calculateTotalAmount(Item item) {
		return item.getPricePerUnit() * item.getQuantity().getValue();
	}
	
	public double calculateSavedAmount(Item item) {
		double totalAmount = calculateTotalAmount(item);
		double discountAmount = getDiscountOnItem(item);
		return totalAmount-discountAmount;
	}
	
}

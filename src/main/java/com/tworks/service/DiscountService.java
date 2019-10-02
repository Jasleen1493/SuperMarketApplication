package com.tworks.service;

import com.tworks.entity.Item;

public class DiscountService {
	
	public double calculateDiscount(Item item) {
		if (item.getDiscount().getValue() != 0)
			return getMaxDiscountValue(item);
		else if (item.getDiscount().getOffer() != null)
			return calculateOffers(item);
		return 0;
	}
	
	public double getMaxDiscountValue(Item item) {
		double itemDiscount = item.getDiscount().getValue();
		double subCategoryDiscount = 0;
		double categoryDiscount = 0;
		if (item.getParentCategory() != null) {
			subCategoryDiscount = item.getParentCategory().getDiscount().getValue();
		}
		
		return checkMaxDiscountValue(itemDiscount, subCategoryDiscount, categoryDiscount);
	}
	
	public double checkMaxDiscountValue(double itemDiscount, double subCategoryDiscount, double categoryDiscount) {
		if (itemDiscount > subCategoryDiscount && itemDiscount > categoryDiscount)
			return itemDiscount;
		else if (subCategoryDiscount > itemDiscount && subCategoryDiscount > categoryDiscount)
			return subCategoryDiscount;
		else if (categoryDiscount > itemDiscount && categoryDiscount > subCategoryDiscount)
			return categoryDiscount;
		return 0;
	}
	
	public double calculateOffers(Item item) {
		String itemOffer = item.getDiscount().getOffer();
		if (itemOffer != null) {
			double itemOfferValue = Double.parseDouble(itemOffer.split("-")[1]);
			return itemOfferValue * item.getPricePerUnit();
		}
		return 0;
	}
}

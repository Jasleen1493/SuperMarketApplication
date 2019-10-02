package com.tworks.strategy;

import java.util.Map;
/**
 * @author Jasleen
 */
public interface DiscountStrategy {
	/**
	 * @param itemDiscountMap takes item name as key, with which discount value will be taken as String
	 * */
	double calculateDiscount(Map<String,String> itemDiscountMap);
}

class DiscountWithOffers implements DiscountStrategy{
	/**
	 * @param itemDiscountMap takes item name as key, with which discount value will be taken as String
	 *                        example : itemDiscountMap.put("Apple","3+1")
	 *                        itemDiscountMap.put("Orange","5+2")
	 * */
	public double calculateDiscount(Map<String, String> itemDiscountMap) {
		return 0;
	}
}
class DiscountInPercentage implements DiscountStrategy{
	/**
	 * @param itemDiscountMap takes item name as key, with which discount value will be taken as String
	 *                        example : itemDiscountMap.put("Milk","10")
	 * */
	public double calculateDiscount(Map<String, String> itemDiscountMap) {
		return 0;
	}
}
class NoDiscount implements DiscountStrategy{
	/**
	 * @param itemDiscountMap takes item name as key, with which discount value will be taken as String
	 *                        example : itemDiscountMap.put("Cheese","0")
	 * */
	public double calculateDiscount(Map<String, String> itemDiscountMap) {
		return 0;
	}
}
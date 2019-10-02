package com.tworks;

import com.tworks.entity.*;
import com.tworks.service.AmountService;
import com.tworks.service.DiscountService;

import java.util.ArrayList;
import java.util.List;

public class SuperMarketApplication {
	public static void main(String[] args) {
		
		Category produce = new Category("Produce", new Discount(10, null),null);
		SubCategory fruits = new SubCategory("Fruits",new Discount(18,null),produce);
		Item apple = new Item("Apple", 50, new Quantity(6,
				SellingUnit.WEIGHT.getUnit()), new Discount(0, "3-1"), fruits);
		
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(apple);
		
		Cart cart = new Cart(itemList);
		
		Customer customer = new Customer("Anish Kumar", cart);
		
		DiscountService discountService = new DiscountService();
		AmountService amountService = new AmountService();
		amountService.setDiscountService(discountService);
		
		double totalAmount = amountService.calculateTotalAmount(apple);
		
		double savedAmount = amountService.calculateSavedAmount(apple);
	}
}

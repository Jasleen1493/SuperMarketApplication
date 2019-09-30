package com.tworks;

import com.tworks.entity.*;

import java.util.ArrayList;
import java.util.List;

public class SuperMarketApplication {
	public static void main(String[] args) {
		
		Category produce = new Category("Produce", new Discount(10, null));
		SubCategory fruits = new SubCategory(produce.getName(), produce.getDiscount(), "Fruits",
				new Discount(18, null));
		Item apple = new Item(fruits.getName(), fruits.getDiscount(), "Apple", 50, 6,
				SellingUnit.WEIGHT.getUnit(), new Discount(0, "3+1"), fruits);
		
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(apple);
		
		Cart cart = new Cart(itemList);
		
		Customer customer = new Customer("Anish Kumar", cart);
		
	}
}

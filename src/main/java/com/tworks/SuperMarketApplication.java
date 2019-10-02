package com.tworks;

import com.tworks.entity.*;

import java.util.ArrayList;
import java.util.List;

public class SuperMarketApplication {
	public static void main(String[] args) {
		
		Category produce = new Category("Produce",null);
		SubCategory fruits = new SubCategory("Fruits", produce);
		Item apple = new Item("Apple", 50, new Quantity(6,
				SellingUnit.WEIGHTINKG.getUnit()),fruits);
		
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(apple);
		
		Cart cart = new Cart(itemList);
		
		Customer customer = new Customer("Anish Kumar", cart);
	}
}

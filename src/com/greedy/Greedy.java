package com.greedy;

import java.util.ArrayList;
import java.util.List;

public class Greedy {

	private List<Product> list;
	private List<Product> boughtItems;
	
	public Greedy() {
		list = new ArrayList<>();
		boughtItems = new ArrayList<>();
		
		list.add(new Product("Milch", 2d));
		list.add(new Product("Getränke", 6d));
		list.add(new Product("Brot", 3.5d));
		list.add(new Product("Äpfel", 3d));
		list.add(new Product("Pizza", 7.5d));
		list.add(new Product("Gemüse", 4d));
		

	}
	
	public List<Product> getItems() {
		double cash = 20d;
		for (int i = 0; i < list.size(); i++) {
			Product p =	getMostExpensiveItem();
			if (cash > p.getPrice()) {
				boughtItems.add(p);
				cash -= p.getPrice();
			}
		}
		return boughtItems;
	}
	
	private Product getMostExpensiveItem() {
		Product product = null;
		double price = 0d;
		for (Product p : list) {
			if (!p.isBought() && p.getPrice() > price) {
				price = p.getPrice();
				product = p;
			}
		}
		product.setBought(true);
		return product;
	}
	
}

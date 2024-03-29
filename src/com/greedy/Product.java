package com.greedy;

public class Product {
	private String name;
	private double price;
	private boolean bought;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBought() {
		return bought;
	}

	public void setBought(boolean bought) {
		this.bought = bought;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", bought=" + bought + "]";
	}
	
}

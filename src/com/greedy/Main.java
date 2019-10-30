package com.greedy;

public class Main {
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		Greedy greedy = new Greedy();
		
		for (Product p : greedy.getItems()) {
			System.out.println(p);
		}
	}
}

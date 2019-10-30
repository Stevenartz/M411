package com.comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		
		List<Buch> buecher = new ArrayList<>();
		buecher.add(new Buch("M183", "Bella", 100, LocalDate.of(2000, 07, 13)));
		buecher.add(new Buch("M123", "Bella", 100, LocalDate.of(2000, 07, 12)));
		buecher.add(new Buch("M411", "Anna", 100, LocalDate.of(2000, 07, 13)));
		
		Collections.sort(buecher);
		
		for (Buch buch : buecher) {
			System.out.println(buch);
		}
		
	}

}

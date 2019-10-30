package com.rekursion_t1;

public class Main {

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		Palindrom_Teil1 pTester = new Palindrom_Teil1();
		System.out.println(pTester.isPalindrom("wefew"));
		System.out.println(pTester.isPalindromLoop("radar"));
		// Works: lagerregal, sugus, rentner, radar
		// Doesn't work: Stefan, Patrick, abbb
	}
}

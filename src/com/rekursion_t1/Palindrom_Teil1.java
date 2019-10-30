package com.rekursion_t1;

public class Palindrom_Teil1 {

	public boolean isPalindrom(String text) {
		return _isPalindrom(text);
	}
	
	private boolean _isPalindrom(String text) {
		boolean status = false;
		if (text.length() > 1) {
			char prefix = text.charAt(0);
			char suffix = text.charAt(text.length() - 1);
			
			if (prefix == suffix) {
				text = text.substring(1, text.length() - 1);
				_isPalindrom(text);
				status = true;
			}
		}
		return status;
	}
	
	public boolean isPalindromLoop(String text) {
		boolean status = false;
		for (int i = 0; i < text.length() / 2; i++) {
			status = (text.charAt(i) == text.charAt((text.length() - 1) - i)) ? true : false;
		}
		return status;
	}
}

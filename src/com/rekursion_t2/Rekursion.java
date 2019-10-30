package com.rekursion_t2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rekursion {

	public int sum(int a, int b, int c) {
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(a, b, c));

		return _sum(list, 0);
	}
	
	private int _sum(List<Integer> list, int sum) {
		if (list.size() > 0) {
			for (int i = 0; i < list.get(0); i++) {
				sum += i;
			}
			System.out.println("added " + list.get(0) + " to " + sum);
			list.remove(0);
			_sum(list, sum);
		}
		return sum;
	}
	
	
}

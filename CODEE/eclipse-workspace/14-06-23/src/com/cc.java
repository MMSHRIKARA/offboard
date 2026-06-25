package com;

import java.util.Arrays;
import java.util.List;

public class cc {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(2,3,5,7,11,13,17,19,23,29);
		System.out.print("count : ");
		System.out.println(l.stream().count());
		Integer sum= l.stream().reduce((c, d)->(c+d)).get();
		System.out.println(sum);
	}

}

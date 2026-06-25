package com;

import java.util.Arrays;
import java.util.List;

public class NumberStartsWith2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,232,43,21,12,29);
//		List<String> list = Arrays.asList("Kaizer","Manoj","Kalkya");
		list.stream()
		.map(n->String.valueOf(n))
//		.map(n->n+"")
		.filter(n-> n.startsWith("2"))
		.forEach(System.out::println);
	}

}

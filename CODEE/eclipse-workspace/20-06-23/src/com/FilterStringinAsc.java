package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FilterStringinAsc {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Green","Banana","Mango","Apple");
		Collections.sort(list);
		System.out.println(list);
	}

}

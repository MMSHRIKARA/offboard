package com;

import java.util.Arrays;

public class ArrangeStringNAscendingOrder {
	public static void main(String[] args) {
		String[] s = { "Green","Banana","Mango","Apple"};

		Arrays.sort(s);

		System.out.println("Sorted array:");
		for (String str : s) {
			System.out.println(str);
		}
	}
}

package com;

import java.util.Arrays;
import java.util.List;

public class ArrangeAlphabets {
	public static void main(String[] args) {
		List<String> flowers = Arrays.asList("Jasmine", "Hybiscus", "Rose", "champa");
		System.out.print("List of Flowers : ");
		for(String fl : flowers) {
			System.out.print(fl+" ");
		}
		
		System.out.print("\nSorted Strings : ");
		flowers.sort((str1,str2)->str1.compareToIgnoreCase(str2));
		for(String sorted : flowers) {
			System.out.print(sorted+" ");
		}
		
	}

}

package com;

import java.util.Arrays;
import java.util.List;

class ConvertToUNLCases{
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Red", "Green", "Blue", "PINK");
		System.out.println("Orignal Strings : "+list);
		
		list.replaceAll(str->str.toLowerCase());
		System.out.print("LoweCase Strings : ");
		for(String nc : list) {
			System.out.print(nc+" ");
		}
		System.out.print("\nUpperCase Strings : ");
		list.replaceAll(str->str.toUpperCase());
		for(String uc : list) {
			System.out.print(uc+" ");
		}
		
		
	}
}
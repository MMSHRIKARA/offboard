package com;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "";
		for(int i=str.length()-1; i>=0; i--) {
			char str2 = str.charAt(i);
			str1 = str1+str2;
			
		}
		System.out.println(str1);
	}

}
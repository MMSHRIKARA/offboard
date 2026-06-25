package com;

public class CountNoOfCharactersInEachWord {
	public static void main(String[] args) {
		String str = "Hello Dev";
		String s[] = str.split(" ");
//		System.out.println(s[0].length());
		for (int i = 0; i < s.length; i++) {

			System.out.println(s[i] + " " + s[i].length());
		}
	}

}
package com;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Capgemini", revstr = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			revstr = ch + revstr;

		}
		System.out.println(revstr);
	}
}

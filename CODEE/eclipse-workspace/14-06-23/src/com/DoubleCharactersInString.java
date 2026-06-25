package com;

public class DoubleCharactersInString {
	public static void main(String[] args) {
		String str = "welcome";
		char ch[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			System.out.print(ch[i] + "" + ch[i]);

		}
	}
}

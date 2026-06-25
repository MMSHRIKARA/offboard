package com;

public class Tword {
	public static void main(String[] args) {

		String[] str = {"TYu","yUi","tYu"};

		for (int i = 0; i < str.length; i++) {
			char chars[] = str[i].toCharArray();

			if (Character.isLowerCase(chars[1])) {
				chars[1] = Character.toUpperCase(chars[1]);
			} else {
				if (Character.isUpperCase(chars[1])) {
					chars[1] = Character.toLowerCase(chars[1]);
				}
			}
			str[i] = new String(chars);
		}
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}

	}
}
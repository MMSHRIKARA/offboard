package com;
//camelCase  studentName
public class CnvrtStringToCamelCase {
	public static void main(String[] args) {
		String s = "Welcome to Capgemini have a good day";
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(ch[0])) {
				ch[0] = Character.toLowerCase(ch[0]);
				System.out.print(ch[0]);

			}

			else if (ch[i] == ' ') {
				ch[i + 1] = Character.toUpperCase(ch[i + 1]);
			} else {
				System.out.print(ch[i]);
			}
		}
	}

}
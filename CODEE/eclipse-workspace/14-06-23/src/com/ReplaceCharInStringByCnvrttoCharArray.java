package com;

public class ReplaceCharInStringByCnvrttoCharArray {
	public static void main(String[] args) {
		String s = "apple";
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] == 'a') {
				ch[i] = 'o';
			} else if (ch[i] == 'p') {
				ch[i] = 'q';

			}

		}
		System.out.println(ch);
	}
}
package com;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		String str = "raju@capge mini.com";
		String rSpecial ="";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
//			if(Character.isLetterOrDigit(ch)) {
			if(Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
				rSpecial = rSpecial+ch;
				
				}
			else {
				continue;
			}
		}
		System.out.println(rSpecial);
	}

}

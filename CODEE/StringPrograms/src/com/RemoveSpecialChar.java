package com;

public class RemoveSpecialChar {
	public static void main(String[] args) {
		String str = "Shrikara:12@34";
		char ch[] = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(Character.isLetterOrDigit(ch[i])) {
				System.out.print(ch[i]);
			}			
		}
	}

}

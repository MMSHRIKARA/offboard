package com;

public class PallindromeString {
	public static void main(String[] args) {
		String s = "ROHON";
		String rev = "";
		for(int i=0; i<s.length(); i++) {
			rev= s.charAt(i)+rev;
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("It is a Pallindrome");
		}
		else
			System.out.println("It is not a Pallindrome");
	}

}

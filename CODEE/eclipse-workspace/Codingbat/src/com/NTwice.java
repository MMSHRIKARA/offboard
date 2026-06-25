//
//Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
//
//
//nTwice("Hello", 2) → "Helo"
//nTwice("Chocolate", 3) → "Choate"
//nTwice("Chocolate", 1) → "Ce"
package com;

public class NTwice {
	public static String nTwice(String a, int b) {
		return a.substring(0,b)+a.substring(a.length()-b);
		
	}
	public static void main(String[] args) {
		System.out.println(NTwice.nTwice("Chocolates", 4));
		
	}

}

package com;

import java.util.Scanner;

public class StringPallindrome {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = scn.next();

		String s = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			s = s + str.charAt(i);
		}
		System.out.println(s);
	}

}

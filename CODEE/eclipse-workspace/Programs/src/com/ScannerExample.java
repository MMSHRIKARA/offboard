package com;

import java.util.Scanner;
public class ScannerExample {
	static final String BORDER="++++++++++++++++++++";
//	static String sb="-------------";
	static final char BLANK = ' ';
	public static void main(String[] args) {
		String firstName;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your first name : ");
		firstName = in.nextLine();
		System.out.println(BORDER);
//		System.out.println(sb);
		System.out.println("Good morning"+BLANK+firstName);
		System.out.println(BORDER);
		
		
		
	}

}

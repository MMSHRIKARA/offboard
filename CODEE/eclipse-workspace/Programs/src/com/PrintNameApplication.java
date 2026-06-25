package com;

import java.util.Scanner;

public class PrintNameApplication {
	static final char COMMA = ',';
	static final char BLANK = ' ';
	
	public static void main(String[] args) {
		String first;
		String last;
		String middle;
		String firstLast;
		String lastFirst;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first name : ");
		first = in.nextLine();
		System.out.println();
		System.out.println("Enter last name : ");
		last = in.nextLine();
		System.out.println("Enter middle initial : ");
		middle = in.nextLine();
		firstLast = first+BLANK+last;
		System.out.println("Name in first-last format is "+firstLast);
		lastFirst = last+BLANK+first;
		System.out.println("Name in last-first format is "+lastFirst);
		System.out.println("Name in last first initial format is "+last+COMMA+BLANK+first+COMMA+BLANK+middle+".");
		
		
	}

}

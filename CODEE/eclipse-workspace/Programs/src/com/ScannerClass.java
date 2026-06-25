package com;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car name : ");
		String CarName = sc.next();
		
		System.out.println("Enter Car No. : ");
		int CarNo = sc.nextInt();
		System.out.println(CarName+" "+CarNo);
		System.out.println(CarName.charAt(0));

	}

}

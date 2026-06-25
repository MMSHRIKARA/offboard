package com;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Demo d = new Demo();
		System.out.println("Enter a number to check Even or Odd : ");
//		d.checkEvenOrOdd(11);
				
		d.checkEvenOrOdd(scan.nextInt());
	}

}

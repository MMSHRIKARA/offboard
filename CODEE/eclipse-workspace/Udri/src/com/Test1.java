package com;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Demo1 d1 = new Demo1();
//		d1.checkPositiveOrNegative(5);
		for(int i=1; i<=5; i++) {
			System.out.println("Enter a no : ");
			d1.checkPositiveOrNegative(scan.nextInt());
			System.out.println("-----------");
		}
	}

}

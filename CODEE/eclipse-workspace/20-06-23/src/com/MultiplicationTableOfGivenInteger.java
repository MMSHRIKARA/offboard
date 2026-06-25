package com;

import java.util.Scanner;

public class MultiplicationTableOfGivenInteger {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Integer : ");
		int no = scan.nextInt();
		int result;
		for (int i = 1; i <= 10; i++) {
			result = no * i;

			System.out.println(no + " X " + i + " = " + result);
		}
	}

}

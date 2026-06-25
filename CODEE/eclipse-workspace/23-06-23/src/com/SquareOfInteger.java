package com;

import java.util.Scanner;

interface ArithmeticOperationSquare {
	int square(int a);
}

public class SquareOfInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArithmeticOperationSquare aOper = n -> n * n;
		System.out.println("Enter an Integer to square : ");
		System.out.println(aOper.square(sc.nextInt()));

	}
}

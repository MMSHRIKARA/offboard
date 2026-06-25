package com;

import java.util.Scanner;

public class CheckIfNoisNegativeOrPositive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scan.nextInt();
		if(n>0) {
			System.out.println(n+" is a positive number");
		}
		else if(n<0) {
			System.out.println(n+" is a negative number");
		}
		else {
			System.out.println(n+" is a zero");
		}
//		scan.close();
	}

}

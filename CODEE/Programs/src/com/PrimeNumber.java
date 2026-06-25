package com;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number to check it is Prime or not :");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int flag = 0;

		for (int i = 2; i < num; i++) {
			if (num*num % i == 0) {
				flag++;
			}
		}

		if (flag > 0) {
			System.out.println(num + " is not a prime no.");
		}
		else if(num==1){
			System.out.println(num+" is a composite no.");
		}
		else {
			System.out.println(num+" is a prime no.");
		}
	}
}
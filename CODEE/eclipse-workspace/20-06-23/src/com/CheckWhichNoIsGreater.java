package com;

import java.util.Scanner;

public class CheckWhichNoIsGreater {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1 = scan.nextInt();
		System.out.println("Enter second number : ");
		int n2 = scan.nextInt();
		System.out.println("Enter third number : ");
		int n3 = scan.nextInt();
		if(n1>n2) {
			if(n1>n3) {
				System.out.println(n1+" is greater");
			}
			else {
				System.out.println(n3+" is greater");
			}
		}
		else if(n2>n3){
			System.out.println(n2+" is greater");
			
		}
		else {
			System.out.println(n3+" is greater");
		}
	}

}

package com;

import java.util.Scanner;

public class AcceptNumberNReverseIt {
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
//		int temp = sc.nextInt();
		int rev=0;
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
	
			
		}
		System.out.println(rev);
//		if(temp!=rev) {
//			System.out.println(temp+" is not a pallindrome");
//		}
//		else {
//			System.out.println(temp+" is a pallindrome");
//		}
	}

}

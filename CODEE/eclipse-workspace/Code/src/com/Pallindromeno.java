package com;

//import java.util.Scanner;

public class Pallindromeno {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int no = sc.nextInt();
		int no = 563;
		int temp=no;
		int rev=0, rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev);
		if(no==rev) {
			System.out.println("no is pallindrome");
		}
		else {
			System.out.println("no is not pallindrome");
		}
	}

}

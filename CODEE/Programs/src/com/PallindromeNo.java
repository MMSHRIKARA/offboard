package com;

public class PallindromeNo {
	public static void main(String[] args) {
		int num = 989;
		int temp = num;
		int rem, rev=0;
		
		while(temp!=0) {
			rem = temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		if(rev==num) {
			System.out.println("It's a pallindrome");

		}
		else {
		System.out.println("It's not a pallindrome");
		}
	}

}

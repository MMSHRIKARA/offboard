package com;

public class PallindromeNo {
	public static void main(String[] args) {
		int no = 987789;
		int temp = no;
		int rev=0, rem;
		while(temp!=0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		}
		System.out.println(rev);
		if(no==rev) {
			System.out.println("It is a pallindrome no");
		}
		else {
			System.out.println("It is not a pallindrome no");
		}
		
		
	}

}

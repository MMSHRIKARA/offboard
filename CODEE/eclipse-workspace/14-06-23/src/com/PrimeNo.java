package com;
//prime no = >1 & divided  by itself
//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47

public class PrimeNo{
	public static void main(String[] args) {
		int n = 45;
		int m=n/2;
		int flag = 0;
		if(n==0 || n==1) {
			System.out.println( n+" is not a prime no");
		}
		else
		for(int i=2; i<=m; i++) {
			if(n%i==0) {
				System.out.println(n+" is not a prime no");
				flag=1;
				break;
			}
			
			
		}
		if(flag==0) {
			System.out.println(n+" is a prime no");
			
		}
	}
}
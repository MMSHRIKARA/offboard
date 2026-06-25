package com;

public class PrimeNo{
	public static void main(String[] args) {
		int n= 30;
		for(int i=0; i<=n; i++) {
			if(i>1) {	
				int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.println(i+" is a prime no");
			}
			/*
			 * else { System.out.println(i+" is not a prime no"); }
			 */
			
			}
		}
	}
}
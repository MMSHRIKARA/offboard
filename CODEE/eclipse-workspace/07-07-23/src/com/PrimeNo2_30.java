package com;

public class PrimeNo2_30 {
	public static void main(String[] args) {
		for(int i=2; i<=30; i++) {
			int count=0;
			for(int j=2; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(i+" is a prime no");
			}
			else {
				System.out.println(i+" is not a prime no");
			}
		}
			
		}
	}


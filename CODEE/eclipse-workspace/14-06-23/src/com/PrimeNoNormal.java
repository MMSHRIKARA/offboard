package com;

//public class PrimeNoNormal {
//	public static void main(String[] args) {
//		int n =2;
//		int count =0 ;
//		for(int i=1; i<=n; i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}
//		if(count ==2) {
//			System.out.println(n+" is a prime no");
//		}
//		else
//			System.out.println(n+" is not a prime no");
//		
//	}
//
//}

public class PrimeNoNormal{
	public static void main(String[] args) {
//		int n= 25;
		for(int i=2; i<=25; i++) {
//			if(i>1) {	
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
//}
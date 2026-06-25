package com;

//public class Prime {
//	public static void main(String[] args) {
//		int n = 11;
//		
//		int count=0;
//		for(int i=2; i<=n; i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}
//			if(count==1) {
//				System.out.println(n+" is a prime no");
//			}
//			else {
//				System.out.println(n+" is not a prime no");
//			
//		}
//	}
//
//}


public class Prime{
	public static void main(String[] args) {
		int n=100;
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
			}
		}
	} 
	
}
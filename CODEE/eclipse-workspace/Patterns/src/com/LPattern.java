package com;

//* 
//* 
//* 
//* 
//* * * * * 
public class LPattern{
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j==1 || i==5) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}

//public class LPattern {
//	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) {
//			if(i<5) {
//				System.out.println("* ");
//			}
//			else {
//				for(int j=1; j<=5; j++) {
//					System.out.print("* ");
//					
//				}
//			}
//			
//		}
//	}
//
//}

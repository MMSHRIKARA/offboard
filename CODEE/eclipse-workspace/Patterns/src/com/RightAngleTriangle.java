package com;
//*
//* *
//* * *
//* * * *
//* * * * *
//public class RightAngleTriangle{
//	public static void main(String[] args) {
//		for(int i =0; i<5; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
//	
//}

public class RightAngleTriangle{
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++){
				if(j<=i) {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}
	
}
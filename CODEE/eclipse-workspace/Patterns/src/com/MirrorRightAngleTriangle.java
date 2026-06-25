package com;
//        *
//      * *
//    * * *
//  * * * *
//* * * * *
//public class MirrorRightAngleTriangle {
//	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) {
//			for(int j=4; j>=i; j--) {
//				System.out.print("  ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
//
//}


public class MirrorRightAngleTriangle{
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==5 || j==5 || i+j==6 ){
					System.out.print("* ");
					
				}
				else if(i+j==7 || i+j==8) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
}
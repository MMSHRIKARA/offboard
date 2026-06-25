//package com;
//
//import java.util.Scanner;
//
//public class FindSumNAverage {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter five numbers : ");
//		int sum = 0;
//		double avg;
//
//		for (int i = 0; i < 5; i++) {
//			int no = scan.nextInt();
//			sum += no;
//		}
//		avg = sum / 5;
//		System.out.println("Sum of five numbers : " + sum);
//		System.out.println("Avg of five numbers : " + avg);
//
//	}
//}





















package com;

import java.util.Scanner;

public class FindSumNAverage{
	public static void main(String[] args) {
		int sum=0, avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 nos");
		for(int i=0; i<5; i++) {
			int no = scan.nextInt();
			sum += no;
			
		}
		avg=sum/5;
		System.out.println("Sum of nos : "+sum);
		System.out.println("Avg of nos : "+avg);
	}
}
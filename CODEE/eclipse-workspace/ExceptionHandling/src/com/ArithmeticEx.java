package com;

import java.util.Scanner;

public class ArithmeticEx {
	public static void  main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		try {
			
//		int div = a/b;
//		System.out.println(div);
			System.out.println(a/b);	//here, internally an object of arithmetic exception is created & that will be thrown
		}
		catch(ArithmeticException e) { //& here that exception will be caught by catch block
			System.out.println("bsdk number will not divisible by 0");
			
		}
		
		System.out.println("Executed!!!");
		
		sc.close();
	}
	}












//class Demo{
//	static Demo d = new Demo();
//	void eat() {
////		int d;
//		System.out.println("hi");
//		
//	}
//	
//	public static void main(String[] args) {
//		d.eat();
////		Demo
//		
////		d.eat();
//	}
//}

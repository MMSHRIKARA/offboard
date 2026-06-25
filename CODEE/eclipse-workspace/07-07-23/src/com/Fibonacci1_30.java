package com;

public class Fibonacci1_30 {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		for(int i=1; i<=30; i++) {
			if(a<=30) {
				
				System.out.println(a);
			}
			int c =a+b;
			a=b;
			b=c;
		}
	}

}

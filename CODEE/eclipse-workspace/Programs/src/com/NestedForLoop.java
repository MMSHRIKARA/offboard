package com;

public class NestedForLoop {
	public static void main(String[] args) {
		for(int i=1; i<=2; i++) {
			System.out.println("Outer for loop starts first");
			for(int j=1; j<=2; j++) {
				System.out.println("Inner for loop i : "+i+"j :"+j);
			}
			System.out.println("Outer for loop ends");
		}
	}

}

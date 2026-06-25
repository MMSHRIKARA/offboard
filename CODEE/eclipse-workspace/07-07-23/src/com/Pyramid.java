package com;

public class Pyramid {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			if(i>=2) {
				for(int l=2; l<=i; l++) {
					System.out.print("* ");
					
				}
			}
			System.out.println();
		}
		
	}

}

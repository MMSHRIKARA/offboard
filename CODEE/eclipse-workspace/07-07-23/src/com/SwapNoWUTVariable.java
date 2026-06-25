package com;

public class SwapNoWUTVariable {
	public static void main(String[] args) {
		int x = 20; 
		int y = 30;
		System.out.println("Befor Swapping : ");
		System.out.println("Value of x : "+x);
		System.out.println("Value of y : "+y);
		x = x+y;
		y=x-y;
		x=x-y;
		System.out.println("Value of x : "+x);
		System.out.println("Value of y : "+y);
		
	}
	

}

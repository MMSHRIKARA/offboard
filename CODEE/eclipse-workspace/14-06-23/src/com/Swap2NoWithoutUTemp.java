package com;

public class Swap2NoWithoutUTemp {
	public static void main(String[] args) {
		int x = 20;
		int y=23;
		x = x+y;
		y=x-y;
		x=x-y;
		System.out.println("y values is : "+y);
		System.out.println("x value is : "+x);
	}

}

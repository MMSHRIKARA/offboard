package com;

public class Swap2NoWU3rdVariable {
	public static void main(String[] args) {
		int x = 90;
		int y =108;
		
//		sum up in x
		x = x+y;
		
//		subtract in summed up to get required
		y=x-y;
		x=x-y;
		
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}

}

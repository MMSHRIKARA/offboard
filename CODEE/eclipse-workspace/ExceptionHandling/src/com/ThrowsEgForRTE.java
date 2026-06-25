package com;

public class ThrowsEgForRTE {
	static void div() throws ArithmeticException {//here if we not used throws keyword also it will be handled
		System.out.println(10/0);
		
	}
	public static void main(String[] args) {
		try {
			
			div();
		}
		catch(ArithmeticException e) {
			System.out.println("Handled");
		}
		System.out.println("Executed!!!");
		
	}

}

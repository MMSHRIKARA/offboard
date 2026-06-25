package com;

public class FinallyBlockEg {
	public static void main(String[] args) {
		try {
			
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid Denominator");
		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("Executed!!!");
		System.out.println("-------------");
		
	//We can have nested try & catch block.
		try {
			try {
				
			}
			catch(Exception e) {
				
			}
		}
		catch(Exception e) {
			
		}
		
	//We can have try and catch block within finally block as well.
		finally {
			try {
				
			}
			catch(Exception e ) {
				
			}
		}
		
	}

}

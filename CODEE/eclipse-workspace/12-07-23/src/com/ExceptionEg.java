package com;

public class ExceptionEg {
	public static void main(String[] args) {
		int[] a = {2,3,4,5};
		try {
			
//			System.out.println(2/0);
			System.out.println(a[5]);
		}
		catch(ArithmeticException e) {
			System.out.println("It is not divisible by 0");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
		
		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}

}

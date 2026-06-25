package com;

public class CheckedExceptionEg {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			
		}
	}

}
//InterruptedException -> CheckedException
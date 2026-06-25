package com;


public class HelloWorld {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println("HelloWorld "+i);
		}
		System.out.println("------");
		
		int j=1;
		while(j<=10) {
			System.out.println("HelloWorld "+j);
			j++;
		}
		
		System.out.println("--------");
		
		int k=1;
		do {
			System.out.println("HelloWorld "+k);
			k++;
		}while(k<=10);
		System.out.println("--------");
		
		System.out.println("HelloWorld\n".repeat(10));
		System.out.println("---------");
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		for(int s : arr) {
			System.out.println("HelloWorld "+s);
		}
		System.out.println("-----------");
		
		
		
		
		
		
			
		
		
	}

}

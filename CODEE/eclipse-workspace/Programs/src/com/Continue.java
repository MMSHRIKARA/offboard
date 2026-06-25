package com;

public class Continue {
	public static void main(String[] args) {
		//for loop
		for(int i=1; i<=10; i++) {
			if(i==5) {
				//using continue statement
				continue; //skips the rest statement
			}
			System.out.println(i);
		}
	}

}
//prints 1 to 10 except 5
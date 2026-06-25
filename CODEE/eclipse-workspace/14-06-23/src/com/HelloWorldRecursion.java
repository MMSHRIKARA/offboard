package com;

public class HelloWorldRecursion {
	public static void print(String name, int times) {
		System.out.println(name+" "+times);
		if (times <10) {
			print(name, times + 1);
		}

	}

	public static void main(String[] args) {
		HelloWorldRecursion.print("HelloWorld", 1);

	}

}

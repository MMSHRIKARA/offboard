package com;

public class StaticBlocks {
	static int age;
	String name;
	static{//in static blocks we can initialize only static variables
		age=20;
	}
	{
		age = 30;
	}
	public static void main(String[] args) {
		System.out.println(age);
		
	}

}

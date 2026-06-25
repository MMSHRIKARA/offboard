package com;

public class ConstructorChaining {
	ConstructorChaining() {
		this(9);
		System.out.println(1);
	}

	ConstructorChaining(int a) {
		this("ro");
		System.out.println(2);
	}

	ConstructorChaining(String b) {
		this(10, "raj");
		System.out.println(3);
	}
	ConstructorChaining(int c, String d){
		System.out.println(4);
	}

	public static void main(String[] args) {
		ConstructorChaining cc = new ConstructorChaining();

	}

}

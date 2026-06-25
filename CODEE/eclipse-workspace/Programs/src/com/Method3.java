package com;

//Method without arguments & with return statements
public class Method3 {
	String display() {
		return "Hello";
	}

	public static void main(String[] args) {
		Method3 m = new Method3();
		System.out.println("Start");

		System.out.println(m.display());

		System.out.println("End");

	}

}

package com;

public class thiskeyword {
	int age = 9;
	String name = "Kaizer";

	thiskeyword(int age, String name) {
		this.age = age;
		this.name = name;

	}

	public static void main(String[] args) {
		thiskeyword a = new thiskeyword(90, "Chaplin");// this keyword is used to point to the current object.
		System.out.println(a.age);
		System.out.println(a.name);
	}
}

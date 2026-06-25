package com;

public class MethodOverloading {
	void display(int a) {
		System.out.println(a);
	}
	void display(int a, String b) {
		System.out.println(a+" "+b);
	}
	void display(int a, double c) {
		System.out.println(a+" "+c);
	}
	void display(int a, String b, double c) {
		System.out.println(a+" "+b+" "+c);
	}

}

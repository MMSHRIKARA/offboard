package com;

public class Demo {
	void display(int a) {
		System.out.println(a);
	}
	
	void display(String a) {
		System.out.println(a);
	}
	
	void display(String a, int b) {
		System.out.println(a+" "+b);
	}
	
	void display(double a) {
		System.out.println(a);
	}
	
	void display(int a, String b) {
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
			Demo d = new Demo();
			d.display(23.45);
			d.display("Hello World");
			d.display(200);
			d.display(1234, "Hi");
			d.display("Bye", 4321);
	}

}


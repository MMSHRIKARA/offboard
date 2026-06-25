package com;

public class A {
	void Ab(){
		System.out.println("Hello");
		System.out.println(this);
	}
	public static void main(String[] args) {
		A r = new A();
		r.Ab();
		System.out.println(r);
		
	}

}

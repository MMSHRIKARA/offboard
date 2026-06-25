package com.staticnnonstatic;
//Static & Non-static example
public class Pen {
	static int a = 5;
	int b = 10;
	public static void main(String[] args) {
		System.out.println(Pen.a);//static variable accessing with the help of classname
		System.out.println(a);//static variable accessing directly
		Pen p = new Pen();
		System.out.println(p.a);//static variable accessing using object reference name 
		System.out.println(p.b);//non-static variable accessing using object reference name
	}
	

}

package com;

public class Variable {
	static int a; //Global or Member Variable
	
	// b & c are Local Variables
	void display(int b) { 
		int c =20;
		System.out.println(a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		Variable v = new Variable();
		v.display(30);
		System.out.println(a);
	}
	

}

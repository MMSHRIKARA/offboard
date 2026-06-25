package com;
//Method with arguments & with return statements
public class Method4 {
	int calc(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		Method4 m = new Method4();
		System.out.println(m.calc(2, 2));
		System.out.println(m.calc(10, 2));
		
	}

}

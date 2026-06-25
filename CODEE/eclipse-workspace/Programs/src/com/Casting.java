package com;

public class Casting {
	public static void main(String[] args) {
		System.out.println("Widening/Implicit casting");
		int a =10;
		double b = a;
		System.out.println(a+" -> "+b);
		System.out.println("Narrowing/Explicit casting");
		double c = 7.99;
		int d = (int)c;
		System.out.println(c+" -> "+d);
		System.out.println("---------");
		System.out.println((char)65);//writes the ASCII alphabet
		System.out.println("----------");
		System.out.println("a"+10);//if first string is present then next also it takes as string only
		System.out.println("----------");
		System.out.println('b'+10);//if first char is present then it will adds the ASCII value of b & 10 then returns the number.
		System.out.println("----------");
		System.out.println('A'+'B');//it will adds both ASCII values & return the number.
		System.out.println("---------");
		System.out.println((char)108);
		
		
		
	}

}

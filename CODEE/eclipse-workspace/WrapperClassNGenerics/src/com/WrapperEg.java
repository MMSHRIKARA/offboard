package com;

/*What is Wrapper Class ?
-> Non-primtive version of primitive datatype is known as Wrapper class. 
For eg : int -> Integer, here int is a primitive datatype & Integer is a non-primitve version of that datatype.
Here, Integer is a Wrapper Class. 

All Wrapper classes are predefined class in java.lang package.

What is Auto-boxing ?
-> Converting primitive datatype into non-primitive datatype automatically.

What is Auto-Unboxing ?
-> Converting non-primitive datatype into primitive datatype automatically.*/

public class WrapperEg {
	public static void main(String[] args) {
		//Primitive way of representing
		int a = 10;
		//Non-Primitive way of representing
		Integer b = new Integer(20);
		System.out.println(a+" "+b);
		
		//Auto-boxing
		char c = 'a';
		Character d = new Character(c);
		System.out.println(c+" "+d);
		
		//Auto-Unboxing
		Double e = new Double(20.25);
		double f = e;
		System.out.println(e+" "+f);
	}

}

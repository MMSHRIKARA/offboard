package com;

/*What is UpCasting ?
-> It is a process of creating an object of subclass & storing it's address into superclass type reference.
   To achieve Upcasting IS-A Relationship is mandatory. 
   For eg : Father f = new Son();
	With upcasted refernce we can access only super class properties. 

What is DownCasting ?
-> It is a process of converting the upcasted reference back to the subclass type reference.
   To achieve Downcasting, Upcasting is mandatory. 
   For eg : Son s = (Son) f;
	With downcasted reference we can access both super class & sub class properties. */

public class Test {
	public static void main(String[] args) {
		Father f = new Son();// Upcasting
		f.bike();// bike() has overridden
		f.car();
//		f.truck(); //we can't acces subclass properties

		System.out.println("-----------");
		Son s = (Son) f; // Downcasting
		s.bike();
		s.truck();
		s.car();// we can access both super class & sub class properties.
		
		
		/*
		 * instanceof operator is used to check if an object is an instance of specific
		 * class or not. Father f = new Father(); Son s = new Son();
		 * System.out.println(f instanceof Son); System.out.println(s instanceof
		 * Father);
		 */
		
		

	}

}

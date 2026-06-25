package com;

import java.util.function.Predicate;
// Predicate is a general functional interface that represents a single argument function
// that returns a boolean value(true or false).
public class PredicateInt {
	public static void main(String[] args) {
		
		//Creating predicate 
		Predicate<Integer> p = age -> age>18;
		
		//Calling predicate method
		System.out.println(p.test(9));
		
			
			
		
		
		
	}

}

package com;

import java.util.function.Function;
//The function type functional interface receives a single argument, processes it, and returns a value
public class FunctionInt {
	public static void main(String[] args) {
		
		//Function which takes number
		//& returns in double
		Function<Integer, Integer> half = a -> a/2;
//		Function<Integer, Double> half = a -> a/2.0;
		
		//Applying the function to get the result
		System.out.println(half.apply(10));
	}

}

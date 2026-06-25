package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//public class ConsumerInt {
//	public static void main(String[] args) {
//		Consumer<String> c = (a)->{
//			System.out.println(a);
//		};
//		c.accept("kuh");
//		
//	}
//
//}

//Java Program to demonstrate
//Consumer's accept() method

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

//The Consumer functional interface in Java accepts a single gentrified argument and doesn't return any value.
public class ConsumerInt {
	public static void main(String args[])
	{
		// Consumer to display a number
		Consumer<Integer> display = a -> System.out.println(a);

		// Implement display using accept()
		display.accept(10);

		// Consumer to multiply 2 to every integer of a list
		Consumer<List<Integer>> modifyNDisplay = l -> {
			for(int i=0; i<l.size(); i++) {
				l.set(i, 2 * l.get(i));
			}
//			l.stream().forEach(a -> System.out.println(a+ " "));
			l.stream().forEach(a -> System.out.print(a+" "));
		};

		// Consumer to display a list of numbers
//		Consumer<List<Integer> >
//			dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

			List<Integer> list = new ArrayList<Integer>();
			list.add(2);
			list.add(1);
			list.add(3);

		// Implement modify using accept()
			modifyNDisplay.accept(list);

		// Implement dispList using accept()
//		dispList.accept(list);
		
		
	}
}

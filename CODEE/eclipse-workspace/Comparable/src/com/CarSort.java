package com;

import java.util.TreeSet;

public class CarSort {
	public static void main(String[] args) {
//		Car c1 = new Car(200);
//		Car c2 = new Car(600);
//		Car c3 = new Car(300);
//		
//		TreeSet<Car> ts = new TreeSet();
//		ts.add(c1);
//		ts.add(c2);
//		ts.add(c3);
		
		TreeSet<Car> ts = new TreeSet();
		ts.add(new Car(200));
		ts.add(new Car(600));
		ts.add(new Car(300));
		
		for(Car c : ts) {
			System.out.println(c);
		}
		
	}

}

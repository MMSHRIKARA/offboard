package com;

public class Test {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.work();
//		Person p = new Person();//we can't instantiate because person is an abstract class
		Person p = new Employee();
		p.work();

	}

}

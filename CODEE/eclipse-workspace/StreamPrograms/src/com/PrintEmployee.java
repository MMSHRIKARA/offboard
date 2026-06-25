package com;

import java.util.ArrayList;
import java.util.List;

public class PrintEmployee {
	public static void main(String[] args) {
		
	List<Employee> li = new ArrayList();
	li.add(new Employee(1, "ram"));
	li.add(new Employee(2, "laxman"));

//	li.stream().forEach(a -> System.out.println("d"));
	li.stream().forEach(System.out::println);
	}
}

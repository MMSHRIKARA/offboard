package com;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Employee {
	int id;
	String name;
	
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "id : "+this.id+" name : "+this.name;
	}
	
	
	public static void main(String[] args) {
		
		Set<Employee> s = new TreeSet();
		s.add(new Employee(21, "Kaizer"));
		s.add(new Employee(22, "Rolex"));
		
		
	}

}

package com;

public class Employee {
	public void softwareEngineer(int id) {
		System.out.println("Method 1");

	}

	public void softwareEngineer(int id, String name) {
		System.out.println("Method 2");

	}

	public void softwareEngineer(int id, String name, double salary) {
		System.out.println("Method 3");

	}

	public void softwareEngineer(int id, String name, double salary, String grade) {
		System.out.println("Method 4");

	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.softwareEngineer(1);
		e.softwareEngineer(10, "Hello");
		e.softwareEngineer(1, "Hello", 10.10);
		e.softwareEngineer(1, "Hello", 10.10, "A4");
	}

}

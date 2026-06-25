package com;

class Std {
	private static int year = 2018;
	private String name;
	private int age;

	public Std(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void display() {
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Year : " + Std.year);
	}

}

public class Sample {
	public static void main(String[] args) {
		// Creating an array to store objects of type Std
		Std[] st = new Std[4];
		// Populating the array
		st[0] = new Std("Bala", 18);
		st[1] = new Std("Rama", 19);
		st[2] = new Std("Raju", 15);
		st[3] = new Std("Raghav", 20);
		// Invoking display method on each object in the array
		for (int i = 0; i < st.length; i++) {
			st[i].display();
			System.out.println();
		}

	}

}

package com;

class Vehicle {
	void car() {
		System.out.println("Car is Started");
	}

	void car(int n) {
		System.out.println("Car is not Started");
	}

	
	public static void main(String[] args) {
//		Vehicle v = new Vehicle();//Object Creation of Parent class
//		Bike b = new Bike();
		Vehicle v1 = new Bike();//Upcasting
		Bike b = (Bike) v1;//Downcasting
//		b.car(2);
		v1.car(5);
		b.car(4);
		v1.car();
		b.car();
		
//		Bike b = (Bike) v;
//		v1.car();
//		v.car();
//		b.car();
//		b.car(2);

	}

}

class Bike extends Vehicle {
	void car() {
//		super.car();
		System.out.println("Car is in repair condition");
	}
	void car(String c) {
		System.out.println("Bye");
	}
}

package com;

public class Test {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.start();
		Vehicle v1 = new Bike();
		v1.start();
		Vehicle v2 = new Car();
		v2.start();
	}

}

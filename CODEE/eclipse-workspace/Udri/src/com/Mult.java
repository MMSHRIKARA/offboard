package com;

abstract class A {
	abstract void car();
}

abstract class B {
	abstract void bike();

}

class Vehicles extends A {
	public static void main(String[] args) {
		Vehicles v = new Vehicles();
//		v.bike();
		v.car();

	}

//	@Override
//	public void bike() {
//		System.out.println("Bike");
//
//	}

	@Override
	public void car() {
		System.out.println("Car");

	}

}

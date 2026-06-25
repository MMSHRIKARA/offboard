package com;

class Bike1 {
	void bike() {
		System.out.println("Old Bike");
	}
	void bike(int n) {
		System.out.println("Having one xtra wheel");
	}
	public static void main(String[] args) {
//		Bike1 b= new Bike1();
		
//		b.bike();
//		b .bike(2);
		Car1 c = new Car1();
		c.bike(2);
		c.bike();
		
	}

}

class Car1 extends Bike1{
	void bike(int n) {
		System.out.println("Having two xtra wheels");
	}
}
package com;

public class Car {
	
	static int cost=40;
	
	static void car() {
		System.out.println("Car is working");
	}
	public static void main(String[] args) {
		System.out.println(cost=20);
		System.out.println(cost=30);
		System.out.println(Vehi.model="2nd edition");
		Car.car();
//		Car c1 = new Car();//but it is not a good practice to access static properties by creating object
//		System.out.println(c1.cost);
		Vehi v = new Vehi();
		System.out.println(v.noOfWheels);
		System.out.println(v.noOfWheels=4);
		Vehi v1 = new Vehi();
		System.out.println(v1.noOfWheels=5);
//		Stuff.doStuff(); 
		System.out.println(LuxuryCar.spareWheel=2);
		
	}
	static class LuxuryCar{//inner class only can be declared as static
		static int spareWheel = 1;
		
		
	}

}
class Vehi{
	static String model = "1st edition";
	int noOfWheels;
	
}
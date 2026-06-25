package com;

interface Bike{
	int wheels = 5;
	static void  car() {
		System.out.println("Car");
	}
//	void truck();
default void bike() {
	System.out.println("Bike");
}
//{	
//	System.out.println("Bike is in good condition");
//	
//}
}
class InterfaceUStaticNDefaultMethod implements Bike{
//	public void car() {
//		System.out.println("Car is in good condition");
//	}
	public void truck() {
		System.out.println("Truck is in good condition");
		
	}
	
	public void bike() {
		System.out.println("I am overriding default method");
	}
		
	
	
	public static void main(String[] args) {
//		Bike.bike();
		InterfaceUStaticNDefaultMethod in = new InterfaceUStaticNDefaultMethod();
//		Bike.car();
		in.truck();
		Bike.car();
		in.bike();
//		in.bike();
		System.out.println(in.wheels);
		
		
		
		
		
		
	}



	

}

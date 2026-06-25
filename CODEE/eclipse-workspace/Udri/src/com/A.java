package com;

abstract class AB {
	abstract void display1();
	

}
abstract class BA{
	abstract void display1();
}
class BC extends AB{
	void display1() {
		System.out.println("Display1");
	}
	void display2() {
		System.out.println("Display2");
	}
	
	public static void main(String[] args) {
		BC bc = new BC();
		bc.display1();
		bc.display2();
		
		
	}
}


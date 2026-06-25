package com;

public abstract class Vehicl {
	abstract void car();

}
class Running extends Vehicl{
	
	void car(){
		System.out.println("Car is running");
		
	}
	public static void main(String[] args) {
		Running r = new Running();
		r.car();
	}
	
	
	
}

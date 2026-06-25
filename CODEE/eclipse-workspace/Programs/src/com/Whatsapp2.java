package com;

public class Whatsapp2 extends Whatsapp1{
	@Override
	void message() {
		super.message();
 		System.out.println("Supports double tick");
	}
	
	void call() {
		System.out.println("Supports voice call");
	}
	

}

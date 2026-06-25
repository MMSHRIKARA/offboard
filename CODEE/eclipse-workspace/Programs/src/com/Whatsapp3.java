package com;

public class Whatsapp3 extends Whatsapp2{
	@Override
	void message() {
		super.message();
		System.out.println("Supports blue tick");
	}
	@Override
	void call() {
		super.call();
		System.out.println("Supports video call");
	}
	void payment() {
		System.out.println("Can pay through Whatsapp");
	}

}

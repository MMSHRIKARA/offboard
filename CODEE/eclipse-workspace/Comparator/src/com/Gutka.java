package com;

public class Gutka {
	int price;
	String name;
	Double nicotine;
//	double nicotine;
	
	Gutka(int price, String name, double nicotine){
		this.price=price;
		this.name=name;
		this.nicotine=nicotine;
	}
	
	public String toString() {
		return "Gutka Price : "+price+" Gutka Name : "+name+" Nicotine : "+nicotine;
	}
		
}

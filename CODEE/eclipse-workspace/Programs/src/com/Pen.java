package com;

public class Pen {
//NonParameterizedConstructor
	Pen(){
		System.out.println("NPC");
	}
//ParameterizedConstructor
	Pen(int a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		Pen p = new Pen();
//		Pen p = new Pen(5);
		
	}

}

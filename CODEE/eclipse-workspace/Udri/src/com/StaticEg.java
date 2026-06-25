package com;

class Ram{
	static void ram() {
		System.out.println("Ram");
	}
}
public class StaticEg extends Ram{
	public static void main(String[] args) {
	
		Ram.ram();
		StaticEg se = new StaticEg();
		se.ram();
		
		
	}

}

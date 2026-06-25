package com;

public class PrintingMachine implements Comparable<PrintingMachine>{
	String name;
	int speed;
	
	PrintingMachine(String name, int speed){
		this.name=name;
		this.speed=speed;
	}
	
	public String toString() {
		return "Name : "+name+" Speed : "+speed;
	}
	
//	public int compareTo(PrintingMachine pm) {
//		return this.speed-pm.speed;
//	}
	
	public int compareTo(PrintingMachine pm) {
		return this.name.compareTo(pm.name);
	}
	

}


package com;

public class Mobile implements Comparable<Mobile> {
	int ram;
	String brand;
	String processor;
	
	Mobile(int ram, String brand, String processor){
		this.ram=ram;
		this.brand=brand;
		this.processor=processor;
	}
	
	public String toString() {
		return "brand : "+this.brand+" ram : "+this.ram+" processor : "+this.processor;
	}
	//sorting based on ram
//	public int compareTo(Mobile m) {
//		return this.ram-m.ram;
//	}
	
	//sorting based on brand
	public int compareTo(Mobile m) {
		return this.brand.compareTo(m.brand);
	}
	

}

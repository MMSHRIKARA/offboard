package com;

import java.util.TreeSet;

public class MobileSort {
	public static void main(String[] args) {
		Mobile m1 = new Mobile(4, "Motorola", "Snapdragon");
		Mobile m2 = new Mobile(8, "Samsung", "Oxygen");
		Mobile m3 = new Mobile(6, "Nokia", "Mediatek");
		
		TreeSet<Mobile> ts = new TreeSet();
		ts.add(m1);
		ts.add(m2);
		ts.add(m3);
		
		for(Mobile m : ts) {
			System.out.println(m);
		}
	}

}

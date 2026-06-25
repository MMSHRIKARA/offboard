package com;

import java.util.TreeSet;

public class ProductSortUName {
	public static void main(String[] args) {
		
		Product p = new Product(1, "Mobile");
		Product p2 = new Product(3, "Watch");
		Product p1 = new Product(2, "Earphone");
		

		
    TreeSet<Product> ts = new TreeSet<Product>();
	ts.add(p);
	ts.add(p1);
	ts.add(p2);
	
	for(Product ps : ts) {
		System.out.println(ps);
	}
    
	}
}

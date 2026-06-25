package com;

import java.util.ArrayList;
import java.util.LinkedList;

/*What is Generics ?
-> Generics is used to specify the element type or object type to be allowed.*/

public class GenericsEg {
	public static void main(String[] args) {
		int a = 9;
		ArrayList<String> l = new ArrayList();
		l.add("low");
		l.add("lowd");
		l.add("lowder");
//		l.add(2); //not allowed
		
		for(String s : l) {
			System.out.println(s);
		}
		
		LinkedList<Integer> ll = new LinkedList();
		ll.add(23);
		ll.add(43);
		ll.add(a);
		
		for(int n : ll) {
			System.out.println(n);
		}
	}

}

package day5;

import java.util.HashSet;

public class Demo {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(20);
		h.add(null);
		h.add("jaa");
		h.add(20);
		h.add(20.98);
		for(Object o : h) {
			System.out.println(o);
		}
		System.out.println("----------");
		System.out.println(h);
		System.out.println("-----------");
		
	}

}

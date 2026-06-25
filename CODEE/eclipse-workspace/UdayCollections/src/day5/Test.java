package day5;

import java.util.LinkedHashSet;

public class Test {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(20);
		lhs.add("java");
		lhs.add(20);
		lhs.add("javascript");
		lhs.add("java");
		
		for(Object o : lhs) {
			System.out.println(o);
		}
		System.out.println("----------------");
		System.out.println(lhs);
	}

}

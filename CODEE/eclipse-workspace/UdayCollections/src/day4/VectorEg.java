package day4;

import java.util.Vector;

public class VectorEg {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20.45);
		v.add("dinga");
		
		for(Object o : v) {
			System.out.println(o);
		}
		
		
	}

}

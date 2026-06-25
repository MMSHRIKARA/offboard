package day2;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(5);
		l.add(1);
		System.out.println(l);
		System.out.println("-------");
		Collections.sort(l);;
		System.out.println(l);
		
	}

}

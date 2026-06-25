package com;

import java.util.*;

public class TestSort1 {
	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Collections.sort(al);
		for (Student s : al) {// : for iteration purpose //for each loop
//		for each loop is commonly used to iterate over an array or a Collections class (eg, ArrayList)
			System.out.println(s.age + " " + s.name + " " + s.rollno);
		}
	}
}
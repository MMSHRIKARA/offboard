package com;

import java.util.Set;
import java.util.TreeSet;

public class StudentArrange {
	public static void main(String[] args) {
		
		Set<Student> slist = new TreeSet();
		slist.add(new Student(101, "Ram", 1));
		slist.add(new Student(103, "Manoj", 3));
		slist.add(new Student(102, "Rohon", 2));
		slist.add(new Student(104, "manoj", 4));
		
		for(Student a : slist) {
			System.out.println(a);
			
		}
		
	}
	

}

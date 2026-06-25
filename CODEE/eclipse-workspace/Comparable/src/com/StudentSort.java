package com;

import java.util.TreeSet;

public class StudentSort {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Kaizer");
		Student s3 = new Student(103, "Ullas");
		Student s2 = new Student(102, "Manoj");
		
		TreeSet<Student> ts = new TreeSet();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		for(Student s : ts) {
			System.out.println(s);
		}
		
	}

}

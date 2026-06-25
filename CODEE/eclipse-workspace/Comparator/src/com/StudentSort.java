package com;

import java.util.TreeSet;

public class StudentSort {
	public static void main(String[] args) {
		
		StudentSortById ss = new StudentSortById();
		TreeSet<Student> ts = new TreeSet(ss);
		
		ts.add(new Student(111, "Kaizer", "Raichur"));
		ts.add(new Student(113, "Kalkya", "Koppal"));
		ts.add(new Student(114, "Abhi", "Gangavathi"));
		ts.add(new Student(112, "Veeresh", "Kalburgi"));
		
		for(Student std : ts) {
			System.out.println(std);
		}
		
		
	}

}

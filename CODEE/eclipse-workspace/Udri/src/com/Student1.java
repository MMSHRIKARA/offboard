package com;

public class Student1 {
	int id;
	static String collegeName="Jsp";
	static void study() {
		System.out.println("Studying");
	}
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		System.out.println( s1.id=101);
//		System.out.println(s1.collegeName);
		System.out.println(Student1.collegeName);
		Student1.study();
		Student1 s2 = new Student1();
		System.out.println(s2.id=102);
		System.out.println(Student1.collegeName);
		Student1.study();
		Student1 s3 = new Student1();
		System.out.println(s3.id=103);
		System.out.println(Student1.collegeName);
		Student1.study();
		
	
		System.out.println();
		
		
	}

}

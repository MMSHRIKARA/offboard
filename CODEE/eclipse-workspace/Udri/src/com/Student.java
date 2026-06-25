package com;

public class Student {
	static int age = 20;
	static String name = "Kaizer";
	static double height = 6.2;
	static void study() {
		System.out.println("Student is studying");
	}
	public static void main(String[] args) {
		System.out.println(age);
		study();
		System.out.println("---------");
		System.out.println(Student.age);
		Student.study();
		System.out.println("------------");
		System.out.println(height);
		System.out.println(Stud.height);
		
	}
	

}
class Stud{
	static double height = 5.2;
}

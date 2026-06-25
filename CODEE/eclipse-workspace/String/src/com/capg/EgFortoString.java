package com.capg;

public class EgFortoString {
	public static void main(String[] args) {
		Student s1 = new Student(21, "Shankarnag", "Bombay");
		Student s2 = new Student(22, "Mannu", "Pune");
		System.out.println(s1);
		System.out.println(s2);

	}

}

class Student {
	int rollNo;
	String stdName;
	String city;

	Student(int rollNo, String stdName, String city) {
		this.rollNo = rollNo;
		this.stdName = stdName;
		this.city = city;

	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stdName=" + stdName + ", city=" + city + "]";
	}
	
	

}

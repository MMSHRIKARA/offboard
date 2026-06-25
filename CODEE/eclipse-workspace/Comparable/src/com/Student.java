package com;

public class Student implements Comparable<Student>{
	int id;
	String name;
	
	Student(int id, String name ){
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "id : "+this.id+" name : "+this.name;
	}
//	public int compareTo(Student s) {
//		return this.id-s.id;
//	}
	
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}

}

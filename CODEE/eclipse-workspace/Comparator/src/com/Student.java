package com;

public class Student {
	int id;
	String name;
	String city;
	
	Student(int id, String name, String city){
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	public String toString() {
		return "Id : "+id+" Name : "+name+" City : "+city;
	}

}

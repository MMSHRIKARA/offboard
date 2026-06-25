package com;

import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
	int studentId;
	String studentName;
	int studentRollNo;

	public Student(int studentId, String studentName, int studentRollNo) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentRollNo=" + studentRollNo
				+ "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub

		return this.studentId - o.studentId;
	}
//	public int compareTo(Student o) {
//		return this.studentName.compareTo(o.studentName);		
//	}

}

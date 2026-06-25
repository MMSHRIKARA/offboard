package com;

import java.util.Comparator;

public class StudentSortById implements Comparator<Student>{
	
//	@Override
//	public int compare(Student x, Student y) {
//		return x.id-y.id;
	
	@Override
	public int compare(Student x, Student y) {
		return x.name.compareTo(y.name);
		
	}
	

}

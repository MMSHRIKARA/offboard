package com;

//public class Employee {
//	public static void main(String[] args) {
//		EmployeeId.createId();
//		EmployeeId.createId();
//	}
//
//}

public class Employee {
	public static void main(String[] args) {
//		EmployeeId.createId();
		EmployeeId empId = EmployeeId.createId();
		System.out.println(empId.EmpId);
		System.out.println(empId);
		System.out.println("----------");
		EmployeeId empId1 = EmployeeId.createId();
		System.out.println(empId1.EmpId=102);
		System.out.println(empId1);
		
	}

}
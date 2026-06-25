package com;

//public class EmployeeId {
//	private static EmployeeId empId;
//	
//	private EmployeeId() {
//		System.out.println("Employee Id is created");
//	}
//	
//	public static void createId() {
//		if(empId==null) {
//			empId=new EmployeeId();
//		}
//		
//	}
//
//}

public class EmployeeId {
	private static EmployeeId empId;
	static int EmpId = 101;
	
	private EmployeeId() {
		System.out.println("Employee Id is created");
	}
	
	public static EmployeeId createId() {
		if(empId==null) {
			empId=new EmployeeId();
		}
		return empId;
	     
	}

}
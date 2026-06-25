package com;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		  List<Employee> emp1 = new ArrayList();
		  List<Employee> emp2 = new ArrayList();

		Employee e1 = new Employee(111, "Manoj", 2000.00);
		Employee e2 = new Employee(112, "Bhavan", 1000.00);
		Employee e3 = new Employee(113, "Rohon", 800.00);
		Employee e4 = new Employee(114, "Shankar", 600.00);
		emp1.add(e1);
		emp1.add(e2);
		emp2.add(e3);
		emp2.add(e4);
		  
		  
		  List<Department> dept = new ArrayList();
		  dept.add(new Department(201,"Developer","Bangalore",emp1));
		  dept.add(new Department(202,"Devops","Bangalore",emp2));
//		  dept.add(new Department(203,"Testing","Mumbai",e3));
//		  dept.add(new Department(204,"SQL","Bangalore",e4));
	
	
	}

}

package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfEmployees {
    
	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee("Bhavan",23,25000));
		emp.add(new Employee("Manoj",25,35000));
		emp.add(new Employee("Shivakumar",28,45000));
		
		//List<Integer> allSalary=emp.stream().map(Employee::getEmpSalary).collect(Collectors.toList());
		Collections.sort(emp,Comparator.comparing(Employee::getEmpName));
		Collections.sort(emp,Comparator.comparing(Employee::getEmpSalary));
		for(Employee emplist:emp) {
			System.out.println(emplist.getEmpName()+" "+emplist.getEmpAge()+" "+emplist.getEmpSalary());
		}
	}	
	
}

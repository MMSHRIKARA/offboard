package col;

import java.util.ArrayList;
import java.util.List;

public class Employee{
	int empId;
	String empName;
	double salary;
	
	public Employee(int empId, String empName, double salary) {
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Raj", 100));
		list.add(new Employee(102, "Raju", 5000));
		list.add(new Employee(103, "Rohan", 1008));
		list.add(new Employee(104, "Ram", 2000));
		list.add(new Employee(105, "Kaizer", 1000));
		
		for(Employee emp : list) {
			if(emp.salary>1000) {
				double bonus = emp.salary*10/100;
				emp.salary+=bonus;
			}
			System.out.println("Employee: " + emp.empName + ", Salary: " + emp.salary);
			
		}
		
	}
	
	
	
}
package com;

import java.util.ArrayList;
import java.util.List;

public class Department implements Comparable<Department>{
	int deptId;
	String deptName;
	String deptLoc;
	List <Employee> emp;
	
	public Department(int deptId, String deptName, String deptLoc, List emp) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
		this.emp = emp;
	}
	

	public int compareTo(Department o) {
		if(this.deptId==o.deptId) {
			return 0;
		}
		else if(this.deptId>o.deptId) {
			return -1;
		}
		else
		
		return 1;
		
	}
	
	

}

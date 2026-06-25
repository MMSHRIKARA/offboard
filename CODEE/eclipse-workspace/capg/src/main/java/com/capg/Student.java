package com.capg;

/**
 * Hello world!
 *
 */
public class Student {
	private int stId;
	private String stName;

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}
	
	public void printStInfo() {
		System.out.println(stId+" "+stName);
	}

}

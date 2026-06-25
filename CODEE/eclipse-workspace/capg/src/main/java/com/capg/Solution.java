package com.capg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Solution {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("kaizer.xml");
		Student student = context.getBean(Student.class);
		student.printStInfo();
	}

}

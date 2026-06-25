package com;

public class StaticKeywordEgEmployee {
	static double salary = 1.2;
	static void work() {
		System.out.println("Employee is working");
	}
	public static void main(String[] args) {
		System.out.println(salary);//directly
		System.out.println(StaticKeywordEgEmployee.salary);//with the help of classname
		work();//internally its like StaticKeywordEgEmployee.work() {classname.method()}
		S.print();
		
	}
	
	

}
class S{
	
	static void  print() {
		System.out.println("hattru ninga manoja");
		
	}
}

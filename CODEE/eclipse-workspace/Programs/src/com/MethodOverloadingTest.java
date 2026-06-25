package com;

public class MethodOverloadingTest {
	public static void main(String[] args) {
		MethodOverloading MO = new MethodOverloading();
		MO.display(10);
		MO.display(20, "TOPI");
		MO.display(30, 35.5);
		MO.display(40, "CAPG", 45.5);
		
	}

}

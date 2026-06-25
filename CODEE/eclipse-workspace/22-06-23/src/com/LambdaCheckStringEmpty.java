package com;

interface StringChecker{
	boolean StringCheck(String a);
}
class CheckStringisEmptyUL{
	public static void main(String[] args) {
//		StringChecker sc = (a)->{
//			return a.isEmpty();
//		
//		};
		StringChecker sc = (a)-> a.isEmpty();
		System.out.println(sc.StringCheck("  "));
	}
}
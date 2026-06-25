package com;

public class StringImmutEg {
	public static void main(String[] args) {
		String s1= "Java";
		 s1="SQL";
		s1="Angular";
		s1.concat("Frontend");
//		s1.concat(s2);
		System.out.println(s1);
		StringBuilder s3 = new StringBuilder("JAVA");
		s3 = new StringBuilder("Sql");
		
		System.out.println(s3);
//		s3.append("SQL");
		System.out.println(s3);
		
		
	}

}

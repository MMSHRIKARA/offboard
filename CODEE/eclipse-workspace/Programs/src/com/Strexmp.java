package com;

public class Strexmp {
	public static void m1(String s1) {
		s1 = s1 + "forgeeks";
	}

	public static void m2(StringBuilder s2) {
		s2.append("forgeeks");
	}

	public static void m3(StringBuffer s3) {
		s3.append("forgeeks");
	}

	public static void main(String[] args) {
		String s1 = "Geeks";
		m1(s1);
		System.out.println("String : " + s1);

		StringBuilder s2 = new StringBuilder("Geeks");
		m2(s2);
		System.out.println("StringBuilder : " + s2);

		StringBuffer s3 = new StringBuffer("Geeks");
		m3(s3);
		System.out.println("StringBuffer : " + s3);
	}

}

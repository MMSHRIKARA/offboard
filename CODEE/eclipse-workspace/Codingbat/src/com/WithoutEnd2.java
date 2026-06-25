//Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
//
//
//withouEnd2("Hello") → "ell"
//withouEnd2("abc") → "b"
//withouEnd2("ab") → ""

package com;

public class WithoutEnd2 {
	public static String withoutEnd2(String str) {
		if(str.length()>2) {
			return str.substring(1,str.length()-1);
		}
		else {
			return "";
		}
		
	}
	public static void main(String[] args) {
		System.out.println(WithoutEnd2.withoutEnd2("Hello"));
		System.out.println(WithoutEnd2.withoutEnd2("ab"));
		
	}

}

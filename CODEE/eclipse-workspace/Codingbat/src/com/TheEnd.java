//
//Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
//
//
//theEnd("Hello", true) → "H"
//theEnd("Hello", false) → "o"
//theEnd("oh", true) → "o"

package com;

public class TheEnd {
	public static String theEnd(String str, boolean condition) {
		if(condition == true){
			return str.substring(0,1);
		}
		else {
			return str.substring(str.length()-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(TheEnd.theEnd("Ayyobro", false));
		System.out.println(TheEnd.theEnd("Ayyobro", true));
		
	}

}

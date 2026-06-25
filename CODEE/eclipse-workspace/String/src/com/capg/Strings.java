//package com.capg;
//
//public class Strings {
//
//	public static void main(String[] args) {
//		
//
//		String str = "    I love to learn java ";
//
////		System.out.println(str.charAt(3));
//
////		System.out.println((char)65);
////
////		System.out.println(str.substring(0, 7));
////
////		System.out.println(str.replace('a', (char)189));
////
////		System.out.println(str.contains("I"));
////
////		System.out.println(str.concat("Sri"));
////
////		System.out.println(str.indexOf('e', 7));
////
////		System.out.println(str.lastIndexOf('e', 7));
////
////		System.out.println(str.length());
////
////		System.out.println(str.strip());
////
////		System.out.println(str.replaceAll("java", "mava"));
////		System.out.println(str.valueOf(i));
////
////		System.out.println(str.startsWith(" "));
////
////		System.out.println(str.endsWith(" "));
//
////		System.out.println(str.split(",", 1));
//		
////		int i = 23;
////		System.out.println(i+30);
////		String s = String.valueOf(i);
////		System.out.println(s+30);
//		
//
//		System.out.println(str.repeat(10));
//		System.out.println("Hello\n".repeat(3));
//		
//
//	}
//
//}


package com.capg;
public class Strings{
	public static void main(String[] args) {
		String str = "   Emphasis is an IT Company ";
		String s = "   Emphasis is an IT Company ";
		String st = "   emphasis is an IT Company ";
		String semp = "";
		//return the character at specified index
		System.out.println(str.charAt(3));
		//return the ascii value of the character at specified index
		System.out.println(str.codePointAt(3));
		//return the ascii value of the character before the specified index
		System.out.println(str.codePointBefore(3));
		//return the no of unicode values found in a string
		System.out.println(str.codePointCount(3, 6));
		//convert string to char array
		System.out.println(str.toCharArray());
		//convert string to lowercase
		System.out.println(str.toLowerCase());
		//convert string to UPPERCASE
		System.out.println(str.toUpperCase());
		// print substring from starting to end of string
		System.out.println(str.substring(4));
		// print substring from starting index to end index -1.(starting index, ending index - 1)
		System.out.println(str.substring(3, 5));
		//splits string into an array of substrings
		String a[] = str.split(" ");
		System.out.println(a[1]);
		//compares two strings returns true if two strings are equal else returns false if two strings are not equal
		System.out.println(s.equals(str));
		//compares by ignoring cases
		System.out.println(str.equalsIgnoreCase(st));
		//returns true if character is present in string
		System.out.println(str.contains(s));
		System.out.println("======");
		//returns true if string starts & ends with specified string else returns false
		System.out.println(str.startsWith("   E"));
		System.out.println(str.endsWith("ny "));
		//returns the index of specified character in string
		System.out.println(str.indexOf("s"));
		//returns true if string is empty
		System.out.println(semp.isEmpty());
		//returns the last index of specified character in a string
		System.out.println(str.lastIndexOf("s"));
		//replaces all string that matches with given string
		System.out.println(str.replaceAll("s", "d"));
		System.out.println(str.replaceAll("si", "del"));
		System.out.println(str.replaceAll("s", s));
		String name = "ROHON";
		System.out.println(name.replace('O','A'));
		System.out.println(name.replace("O", ""));
		
	}
}

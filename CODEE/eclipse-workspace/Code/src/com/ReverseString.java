package com;

public class ReverseString {
//	public static String reverseString(String str) {
//		String rev="";
//		char ch[] = str.toCharArray();
//		for(int i=ch.length-1; i>=0; i--) {
//			rev=rev+ch[i];
//		}
//		
//		
//		return rev;
//		
//	}
//	public static void main(String[] args) {
//		System.out.println(ReverseString.reverseString("Hello Jiomi"));
//		
//	}
	public static void main(String[] args) {
		String str = "Infosys", revstr = "";
		char ch[] = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			revstr = revstr + ch[i];
		}
		System.out.println(revstr);
	}

}

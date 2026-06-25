package com;

public class PallindromeString {
	public static void main(String[] args) {
		String str = "Mindtree", revstr="";
		System.out.println("Original String : "+str);
		char ch[]=str.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			revstr=revstr+ch[i];
		}
		System.out.println("Reverse String : "+revstr);
		if(str.equalsIgnoreCase(revstr)) {
			System.out.println("It is not a pallindrome");
		}
		else {
			System.out.println("It is a pallindrome");
		}
	}

}


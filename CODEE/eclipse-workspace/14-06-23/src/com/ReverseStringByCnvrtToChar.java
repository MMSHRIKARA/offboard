package com;

public class ReverseStringByCnvrtToChar {
	public static void main(String[] args) {
		String str = "Mindtree", revstr="";
		System.out.println("Original String : "+str);
		char ch[]=str.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			revstr=revstr+ch[i];
//			revstr=ch[i]+revstr;
		}
		System.out.println("Reverse String : "+revstr);
	}

}

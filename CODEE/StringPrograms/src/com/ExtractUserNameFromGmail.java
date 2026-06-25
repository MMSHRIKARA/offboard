package com;

public class ExtractUserNameFromGmail {
	public static void main(String[] args) {
		String str = "kaizer@gmail.com";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '@') {
				System.out.println(str.substring(0,i));
				
			}
		}
	}

}

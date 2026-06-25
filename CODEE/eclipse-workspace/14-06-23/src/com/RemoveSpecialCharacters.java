package com;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		String str = "kaize r@capgemini.com";
		String rSCh = "";
//		char ch[]=str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			char ch =str.charAt(i);
			if(Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
				rSCh = rSCh+ch;
				
			}
			
			
		}System.out.println(rSCh);
	}

}

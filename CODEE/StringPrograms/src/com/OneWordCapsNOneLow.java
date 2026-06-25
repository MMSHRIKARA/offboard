package com;

public class OneWordCapsNOneLow {
	public static void main(String[] args) {
		String str = "pWseryu";
//		
//		String str1 = str.toUpperCase();
//		char[] ch = str1.toCharArray();
//		for(int i=1; i<str1.length(); i+= 2) {
//			ch[i] = Character.toLowerCase(ch[i]);
//		}
//		System.out.println(ch);
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(i%2 ==0) {
				ch[i] = Character.toUpperCase(ch[i]);
			}
			else {
				ch[i] = Character.toLowerCase(ch[i]);
			}
			
			
		}
		System.out.println(ch);
	}

}

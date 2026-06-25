
package com;
public class CnvrtStringToCamelCaseUStringMethods{
	public static void main(String[] args) {
		String sentence = "     Welcome to Capgemini, Have a good day";
		String str = sentence.strip();
		char ch[] = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			if(ch[i] == ' ') {
				ch[i+1] = Character.toUpperCase(ch[i+1]);
				
			}
			else if(Character.isUpperCase(ch[0]))
			{
				ch[0]= Character.toLowerCase(ch[0]);
			}
			
		}
		String s = String.valueOf(ch);
//		System.out.println(s);
		System.out.println(s.replace(" ",""));
	}
}
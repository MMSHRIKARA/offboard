package com;
//PascalCase	StudentName
public class CnvrtStringToPascalCaseUStringMethods {
	public static void main(String[] args) {
		String sentence = "     welcome to Capgemini, Have a good day";
		String str = sentence.strip();
		char ch[] = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(Character.isLowerCase(ch[0])) {
				ch[0]=Character.toUpperCase(ch[0]);
			}
			else if(ch[i]==' ') {
				ch[i+1]=Character.toUpperCase(ch[i+1]);
			}
		}
		String s = String.valueOf(ch);
		System.out.println(s.replace(" ", ""));
		
	}

}

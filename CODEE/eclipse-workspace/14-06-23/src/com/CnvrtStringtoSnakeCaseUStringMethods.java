package com;
//snake_case	student_id
public class CnvrtStringtoSnakeCaseUStringMethods {
	public static void main(String[] args) {
		String sentence = "     Welcome to Capgemini, Have a good day";
		String str = sentence.strip();
		char ch[] = str.toCharArray();
		for(int i=0 ; i<ch.length; i++) {
			if(Character.isUpperCase(ch[0])) {
				ch[0]=Character.toLowerCase(ch[0]);
			}
			else if(ch[i]==' ') {
				ch[i]='_';
//				ch[i]='-';//kebab-case
				ch[i+1]=Character.toLowerCase(ch[i+1]);
				
			}
		}
		System.out.println(ch);
	}

}

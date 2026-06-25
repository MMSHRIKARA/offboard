package com;
public class CamelCase{
	public static void main(String[] args) {
		String str = "   Welcome to capgemini, have a nice day";
		String sa = str.strip();
		char ch[] = sa.toCharArray();
		for(int i=0; i<sa.length(); i++) {
			if(ch[i] == ' ') {
				ch[i+1] = Character.toUpperCase(ch[i+1]);
				
			}
			else if(Character.isUpperCase(ch[0]))
			{
				ch[0]= Character.toLowerCase(ch[0]);
			}
			
		}
//		System.out.println(ch);
		String s = String.valueOf(ch);
//		System.out.println(s);
		//String a = s.replace(" ","");
		s=s.replace(" ","");
//		System.out.println(s.replace(" ",""));
		System.out.println(s);
	}
}
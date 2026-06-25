package com;

public class ExtractUsernameFrmEmail {
	public static void main(String[] args) {
		String s = "john@cpagemini.com";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '@') {
				System.out.println(s.substring(0, i));

			}
		}
	}
}

//public class ExtractUsernameFrmEmail{
//public static void main(String[] args) {
//	String s = "john@capgemini.com";
//	char ch[] = s.toCharArray();
//	for(int i=0; i<ch.length; i++) {
//		if(ch[i]=='@') {
//			break;
//		}
//		System.out.println(ch[i]);
//		
//	}
//}
//}
package com;

public class ReplaceCharNString {
	public static void main(String[] args) {
		String str = "ammly";
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='m') {
				System.out.print('p');
			}
			else if(ch[i]=='y') {
				System.out.print('e');
			}
			else {
				System.out.print(ch[i]);
			}
		}
	}

}

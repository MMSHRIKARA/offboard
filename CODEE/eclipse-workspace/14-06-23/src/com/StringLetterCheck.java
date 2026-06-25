package com;

public class StringLetterCheck {
	public static void main(String[] args) {
		String str = "Capgemini";
		char ch[] = str.toCharArray();
//		int c  = 0;
		int count=0;
		
//		for(int j=1; j<ch.length; j++) {
//			c++;
//		}
//		for(int i=0; i<c; i++) {
//			if(ch[i]=='i') {
//				count++;
//			}
//		}
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='i') {
				count++;
			}
		}
		
		if(count>=1) {
			System.out.println("Present");
		}
		
		else
			System.out.println("Not Present");
			
	}

}

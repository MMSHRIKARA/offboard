package com;

public class DoubleCharSequence {
	public static void main(String[] args) {
		String str = "doublecharacters";
		char ch[] = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]+""+ch[i]);
		}
	}

}

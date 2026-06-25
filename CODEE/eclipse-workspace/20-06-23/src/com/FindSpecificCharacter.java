package com;

import java.util.Scanner;

public class FindSpecificCharacter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Word : ");
		String str = scan.next();
		System.out.println("enter ch");
		char ch =scan.next().charAt(0);
//		String str = "Capgemini";
//		char ch[] = str.toCharArray();
		int count=0;
		for(int i=0; i<str.length(); i++) {
//			if(ch[i]=='i') {
				if(str.charAt(i)==ch)
				count++;
			}
//		}
		System.out.println(count);
	}

}

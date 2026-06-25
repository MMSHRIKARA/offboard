package com;

import java.util.Scanner;

public class FirstNonReptedCharInWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word = sc.next();
		String str = word.toLowerCase();
		for(int i=0; i<str.length(); i++) {
			int count=0;
			for(int j=0; j<str.length(); j++) {
				if(word.charAt(i)==str.charAt(j) && i!=j) {
					count++;
				}
			}
			if(count==0) {
				
				System.out.println("First Non Repeating Character is : "+str.charAt(i));
				break;
				
			}
		}
		
	}

}

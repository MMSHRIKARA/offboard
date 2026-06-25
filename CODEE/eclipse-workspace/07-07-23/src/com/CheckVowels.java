package com;

import java.util.Scanner;

public class CheckVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word : ");
		String word = sc.next();
		String str = word.toLowerCase();
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				count++;
				
			}
		}
		System.out.println("No of vowels : "+count);
		
	}

}

package com.customexception.matrimonyeg;

import java.util.Scanner;

public class MatrimonyPortal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		if(age>=21) {
			System.out.println("Get Married Soon...");
		}
		else {
				
			try {
				throw new InvalidAgeException("Age is not crossed");
			}
			catch(InvalidAgeException e) {
				System.out.println(e.getMessage());
				
			}
			
		}
	}

}

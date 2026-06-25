package com;

import java.util.Scanner;

public class WeekdayNameGenerator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number (1-7) :");
		int number = scan.nextInt();
		switch (number) {
		case 1:
			System.out.println("Weekday : Monday");
			break;
		case 2:
			System.out.println("Weekday : Tuesday");
			break;
		case 3:
			System.out.println("Weekday : Wednesday");
			break;
		case 4:
			System.out.println("Weekday : Thursday");
			break;
		case 5:
			System.out.println("Weekday : Friday");
			break;
		case 6:
			System.out.println("Weekday : Saturday");
			break;
		case 7:
			System.out.println("Weekday : Sunday");
			break;
		default:
			System.out.println("Please enter a valid number (1-7)");

			break;
		}

	}
}
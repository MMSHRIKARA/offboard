package com;

import java.util.Scanner;

public class FindNumberOfDaysInMonth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String monthOfName="";
		int noOfDays=0;
		System.out.println("Input a month number : ");
		int month = scan.nextInt();
		System.out.println("Input a year : ");
		int year = scan.nextInt();
		switch(month) {
		case 1 :
			monthOfName = "Janauary";
			noOfDays = 31;
			break;
		
		case 2 :
			monthOfName = "Febrauary";
			if((year%400==0) || ((year%4==0)&&(year%100!=0))){
				noOfDays = 29;
				}
			else {
				noOfDays = 28;
			}
			break;
		case 3 :
			monthOfName = "March";
			noOfDays=31;
			break;
		case 4 :
			 monthOfName = "April";
			 noOfDays=30;
			 break;
		case 5 :
			 monthOfName = "May";
			 noOfDays=30;
			 break;
		case 6 :
			 monthOfName = "June";
			 noOfDays=30;
			 break;
		case 7 :
			 monthOfName = "July";
			 noOfDays=30;
			 break;
		case 8 :
			 monthOfName = "August";
			 noOfDays=30;
			 break;
		case 9 :
			 monthOfName = "September";
			 noOfDays=30;
			 break;
		case 10 :
			 monthOfName = "October";
			 noOfDays=31;
			 break;
		case 11 :
			 monthOfName = "November";
			 noOfDays=30;
			 break;
		case 12 :
			 monthOfName = "December";
			 noOfDays=31;
			 break;
		default : System.out.println("Enter a valid month number : ");
			 
			
	}
		System.out.println(monthOfName+" has "+noOfDays+" days");
	}
}

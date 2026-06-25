package com;

//public class MissingNumberInArrray {

//	public static void main(String[] args) {
//		int arr[]= {2,3,4,6,7,8,9};
//		
//		for(int i=0; i<arr.length; i++) {
//			
//			
//		}
//		
//	}
//
//}

//import java.util.Scanner;

class Missing {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);

//		System.out.println("Enter the length of an array : ");

//		int n = scan.nextInt();
		int n[] = {1,2,3,4,6};
//		int aLen = n.length; 

		int InputArray[] = new int[n.length];

//		System.out.println("Enter the array elements upto (n-1) : ");

		for (int i = 0; i < n.length-1; i++) {

			InputArray[i] = n[i];

		}

		int sumOfAll = ((n.length) * (n.length + 1)) / 2;

		int sumOfArray = 0;

		for (int i = 0; i < InputArray.length; i++) {

			sumOfArray += InputArray[i];

		}

		int missingNum = sumOfAll - sumOfArray;

		System.out.println("Ihe muissing number in Array is : " + missingNum);

	}

}
package com;

import java.util.Scanner;

public class ArrayIndexOutOfBondsEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {10,20,30};
		System.out.println("Enter the index value to display : ");
		try {
		System.out.println(a[sc.nextInt()]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("adsike u r trying to display value of the index, where that index is not there in that array");
		}
		catch (Exception e) {
			System.out.println("Exception occured");
		}
		sc.close();
		System.out.println("Executed!!!");
		
	}

}

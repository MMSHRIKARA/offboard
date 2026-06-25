package com;

public class SecondSmallestNumberInArray {
	public static void main(String[] args) {
		int arr[] = { 29, 45, 32, 21, 9, 8 };
		int temp;
//		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
			}
			System.out.print(arr[i]+" ");
		}
//		System.out.print("}");
		System.out.println();
		System.out.println("Second smallest no in array : "+arr[1]);
		System.out.println("Second largest no in array : "+arr[arr.length-2]);
	}

}

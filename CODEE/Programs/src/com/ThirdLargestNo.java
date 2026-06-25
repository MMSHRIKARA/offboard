package com;

public class ThirdLargestNo {
	public static void main(String[] args) {
		int[] arr = { 21, 35, 12, 29, 6, 108 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}

			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println(arr[arr.length-3]);

	}

}

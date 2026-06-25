package com;
//Bubble sort is the sorting algorithm works on repeatedly by Swapping the adjacent elements until they are not in the intended order.

public class SortBubbleSort {
	public static void main(String[] args) {
		int arr[] = { 108, 1, 4, 3, 98, 27 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length -i - 1; j++) {// by using i here it will reduce the time complexity by
// decreasing iterating with last element because last
// element is already sorted so.
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
//			System.out.println(arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");
		}
	}
}
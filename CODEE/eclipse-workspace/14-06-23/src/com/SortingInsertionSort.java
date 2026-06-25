package com;
//Insertion sort means it will divide into two array one is sorted array & another one is unsorted array
//it will compare one element from unsorted array with all elements of sorted array.

public class SortingInsertionSort {
	public static void main(String[] args) {
		int arr[] = { 76, 23, 12, 2, 9, 4 };
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
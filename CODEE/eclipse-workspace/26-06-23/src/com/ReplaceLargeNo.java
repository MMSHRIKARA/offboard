package com;

//Replace large no if greater than current index to the right side else print -1.
public class ReplaceLargeNo {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 10, 20, 0, 1, 30, 0 };
		for (int i = 0; i < arr.length - 1; i++) {
			int flag = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					flag = 1;
					arr[i] = arr[j];
				}
			}
			if (flag == 0) {
				arr[i] = -1;
			}
			arr[arr.length-1]=-1;
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}

}
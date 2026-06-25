package com;

public class SortIntegerInArray {
	public static void main(String[] args) {
		int arr[] = {24,3,12,98,2,1};
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
			System.out.print(arr[i]+" ");
		}
	}

}

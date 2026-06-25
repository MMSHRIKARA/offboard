package com;

public class ThirdLargestInArray {
	
	public static void main(String[] args) {
		
		int arr[]= {67,93,9,37,102,98,04};
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			System.out.print(arr[i]+",");
		}
		System.out.println();
		System.out.println("Third largest value in array is "+arr[arr.length-3]);
		System.out.println("Third smallest value in array is "+arr[2]);
		
	}

}

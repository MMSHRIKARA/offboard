package com;
//Normal sort is the sorting algorithm works on repeatedly swapping of elements until they are not in the intended order.
public class Sort {
	public static void main(String[] args) {
		int arr[] = {108, 1, 4, 3, 98, 27};
		int temp;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

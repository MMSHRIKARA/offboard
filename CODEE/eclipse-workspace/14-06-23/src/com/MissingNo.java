package com;
public class MissingNo{
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,9,8,7};
		int sum=0;
		int expArrayLength = arr.length+1;
		int total = (expArrayLength)*(expArrayLength+1)/2;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("Missing no is : "+(total-sum));
		
		
	}
}
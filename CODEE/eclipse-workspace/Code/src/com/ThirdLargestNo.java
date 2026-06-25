package com;

public class ThirdLargestNo {
	public static int getThirdNo(int a[], int total) {
		int temp;
		for(int i=0; i<total; i++) {
			for(int j=i+1; j<total; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-3];
		
	}
	public static void main(String[] args) {
		int c[] = {9,4,3,5,2,6,7,1};
		int b[]= {21,32,34,45,6,45,3};
		System.out.println(ThirdLargestNo.getThirdNo(c, 8));
		System.out.println(ThirdLargestNo.getThirdNo(b, 7));
		
	}

}
	
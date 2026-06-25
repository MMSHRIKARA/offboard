package com.prac.sujit;

import java.util.Arrays;
import java.util.Scanner;

public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a =0;
		int ans=0;
		int []arr=new int[n];
		int sum=((n+1)*(n+2))/2;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			 sum=sum-arr[i];
		}
      System.out.println(sum);
	}
}

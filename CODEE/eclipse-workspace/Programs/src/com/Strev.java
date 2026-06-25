package com;

import java.util.Scanner;

public class Strev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         String str=sc.next();
         char[] arr=str.toCharArray();
         for(int i=arr.length-1;i>=0;i--) {
        	 System.out.print(arr[i]);
         }
         int count=0;
         for(int i=0;i<arr.length;i++) {
        	 if(arr[i]=='a'){
        		 count++;
        	 }
         }
         System.out.println("  "+count);
	}

}

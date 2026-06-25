package com.prac.sujit;

public class Task4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="my name is sujit";
        char[] arr=str.toCharArray();
        arr[0]=Character.toUpperCase(arr[0]);
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==' ') {
        		arr[i+1]=Character.toUpperCase(arr[i+1]);
        	}
        }
        System.out.println(arr);
	}

}

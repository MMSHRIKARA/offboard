package com;

import java.util.TreeSet;

public class ThirdLargestUTreeset{

public static void main(String[] args) {
	TreeSet<Integer> l = new TreeSet<>();
	l.add(10);
	l.add(5);
	l.add(4);
	l.add(57);
	l.add(5);
	System.out.println(l);
	
	int arr[] = new int[l.size()];
	int i=0;
	for(int a : l) {
		arr[i++]=a;
		System.out.println(a);
		
	}
	System.out.print("Third largest no : ");
	System.out.println(arr[arr.length-3]);
	
	
}
}
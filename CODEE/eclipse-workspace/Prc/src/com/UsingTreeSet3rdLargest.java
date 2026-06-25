package com;

import java.util.TreeSet;

public class UsingTreeSet3rdLargest {
	
//	public static void main(String[] args) {
//		
//		TreeSet<Integer> tree=new TreeSet<>();
//		tree.add(100);
//		tree.add(50);
//		tree.add(10);
//		tree.add(40);
//		tree.add(90);
//		tree.add(70);
//		
//		System.out.println(tree);
//		
////		int n=tree.size();
//		
////		int[] arr=new int[n];
//		
//		int arr[] = new int [tree.size()];
//		
//		int i=0;
//		
//		for(int a:tree) {
//			arr[i++]=a;
//			System.out.print(a+" ");
//		}
////		for(int b:arr) {
////			System.out.print(b+" ");
////		}
//		System.out.println();
//		System.out.print("Third largest in the tree set is : ");
//		
//		System.out.println(arr[arr.length-3]);
//		
//	}

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

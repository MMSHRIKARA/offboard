package com;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,5,23,22,78,19,90,232);
		for(int even : list) {
			if(even%2==0) {
				System.out.println("Even no : "+even);
			}
			
		}


	}}

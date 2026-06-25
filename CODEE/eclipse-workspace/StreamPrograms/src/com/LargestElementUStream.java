package com;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class LargestElementUStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,1,3,4,5,9,43,32,56);
		System.out.print("Max value : ");
		int largest = list.stream().max(Integer::compare).get();
		System.out.println(largest);
		
		Integer s=list.stream().min((Integer a, Integer b) -> a-b).get();
		System.out.print("Min value : ");
//		Integer s=list.stream().min(Integer::compare).get();
		System.out.println(s);
		
		Long count=list.stream().count();
		int c=count.intValue();
		System.out.println(c);
		
		Integer avg=list.stream().reduce((a,b)->(a+b)/c).get();
		System.out.println(avg);
		
		Integer sum=list.stream().reduce((a,b)->(a+b)).get();
		System.out.println(sum);
		
		
	}

}

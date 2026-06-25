package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenOrOddNo {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
		System.out.print("Print the given nums : ");
		for(int n : nums) {
			System.out.print(n+" ");
		}
		
		System.out.print("\nPrint Even nums : ");
		List<Integer> evenNumbers = nums.stream().filter(n->n%2==0).collect(Collectors.toList());
		for(int n : evenNumbers) {
			System.out.print(n+" ");
		}
		
		System.out.print("\nPrint Odd nums : ");
		List<Integer> oddNumbers = nums.stream().filter(n->n%2!=0).collect(Collectors.toList());
		for(int n : oddNumbers) {
			System.out.print(n+" ");
		}
	}

}

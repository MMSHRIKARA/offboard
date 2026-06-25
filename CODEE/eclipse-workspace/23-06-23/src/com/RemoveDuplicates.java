package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);
		System.out.println("List : "+nums);
		List<Integer> uniqueNo = new ArrayList<>();
		nums.stream().distinct().forEach(uniqueNo::add);
		
		System.out.println("Elements without Duplicates : "+uniqueNo);
	}

}

package com;

import java.util.Arrays;
import java.util.List;

public class CountNoOfElements {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,4,5,1,2,3,4);
		//count() is a type of long datatype.
		long count = list.stream().count();
		System.out.println(count);
	}

}

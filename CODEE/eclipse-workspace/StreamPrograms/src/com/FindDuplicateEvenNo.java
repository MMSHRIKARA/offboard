package com;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateEvenNo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,4,5,3,2,6,7,2,1);
		Set<Integer> set = new LinkedHashSet();
		list.stream().filter(n-> n%2==0).filter(n -> !set.add(n)).forEach(System.out::println);
		//here first it will filter only even numbers & then by using set it will find duplicates by
		//printing elements which are not present in set. (because set does not allow duplicates so)
		
	}

}

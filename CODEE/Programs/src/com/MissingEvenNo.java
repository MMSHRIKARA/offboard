package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class MissingEvenNo {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(2, 4, 6, 10, 14, 16, 20, 12);
		
		Collections.sort(al);
		
//		for(int i=2; i<al.get(al.size()-1); i++) {
//			if(al.contains(i)) {
//				continue;
//			}
//			else if(i%2 ==0) {
//				System.out.print(i+" ");
//			}
		

		IntStream.range(2, al.get(al.size()-1)).filter(i -> !al.contains(i) && i%2 == 0).forEach(i -> System.out.print(i+" "));
			
		}
	}


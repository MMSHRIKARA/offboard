package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MissingOddNo {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(1, 5, 7, 9, 13);
		IntStream.range(1, al.get(al.size()-1)).filter(i -> !al.contains(i) && i%2!=0).forEach(i -> System.out.print(i+" "));
	}

}

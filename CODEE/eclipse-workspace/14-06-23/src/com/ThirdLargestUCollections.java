package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargestUCollections {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(90, 21, 22, 18, 9, 4);

		Collections.sort(list);

		System.out.println(list.get(list.size() - 3));

	}

}

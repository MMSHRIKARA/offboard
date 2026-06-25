package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNoUCollections {
	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(5, 3, 9, 4);

		Collections.sort(l);

		for (int i = 1; i < l.get(l.size() - 1); i++) {
			if (l.contains(i)) {
				continue;
			} else {
				System.out.println(i);
			}

		}
	}
}

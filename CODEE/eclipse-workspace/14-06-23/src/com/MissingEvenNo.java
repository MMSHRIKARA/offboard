package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingEvenNo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 6, 10, 14, 16, 20, 12);

		Collections.sort(list);
		for(int i=1; i<list.get(list.size()-1); i++) {
			if(list.contains(i)) {
				continue;
			}
			else if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		


		}
	}



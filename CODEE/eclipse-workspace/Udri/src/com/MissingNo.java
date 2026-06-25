package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//public class MissionNo {
//public static void main(String[] args) {
//	int arr[] = {1,2,3,5,6,7};
//	int expArrayLength = arr.length+1;
//	int total = (expArrayLength)*(expArrayLength+1)/2;
//	int sum=0;
//	for(int i=0; i<arr.length; i++) {
//		sum += arr[i];
//	}
//	System.out.println("Missing no is : "+(total-sum));
//}
//}

public class MissingNo{
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(2,5,15,7);
		Collections.sort(l);
		for(int i=1; i < l.get(l.size() - 1); i++) {
			if(l.contains(i)) {
				continue;
			}
			else {
				System.out.println(i);
			}
			
		}
		
	}
}
package com;

import java.util.Arrays;
import java.util.List;

public class FilterPrimeNo {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(2, 3,5,23,22,78,19,90,97,232);
//		int count =0;
//		
//		for(int l : list) {
////			System.out.println(l);
//			for(int i=2; i<l; i++) {
//				if(l%i==0) {
//					count++;
//				}
//			}
//			if(count == 0) {
//				System.out.println(l+" is a prime no");
//			}
////			else
////				System.out.println(l+" is not a prime no");
////			
//		}
//		}
//
//	}


List<Integer> l = Arrays.asList(2,3,5,7,97,6,88,22,232,83);
int count=0;
for(int a:l) {
    for(int i=2;i<a;i++) {
        if(a%i==0)
        {
            count++;
        }
    }
    if(count==0)
    {
        System.out.println(a+"is prime no");
    }
}
}}



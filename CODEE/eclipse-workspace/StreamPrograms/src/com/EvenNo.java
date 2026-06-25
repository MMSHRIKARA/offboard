package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNo {
	public static void main(String[] args) {
		List<Integer> listOfNos = Arrays.asList(2,3,4,4,5,6,7,8);
//		for(Integer even : listOfNos) {
//			System.out.println(even);
//		}
//		listOfNos.stream().filter(n -> n%2==0).forEach(l->System.out.println(l));
//		listOfNos.stream().filter(n -> n%2!=0).forEach(System.out::println);
		
		listOfNos.stream().filter(n -> n%2==0).collect(Collectors.toList()).forEach(System.out::println);
		
		listOfNos.stream().filter(n -> n%2 == 0).collect(Collectors.toSet()).forEach(System.out::println);
//		System.out.println(even);
//		for(Integer e : even) {
//			System.out.println(e);
//		}
		System.out.println("--------");
		//for perform some operation or function of to add like that
		//we have to use map() 
		List<Integer> no = Arrays.asList(3,1,3,2,4,4,5);
		no.stream().map(n->n*2).collect(Collectors.toSet()).forEach(System.out::println);
		System.out.println("-------");
		//print only which are lesser than specified value
		no.stream().filter(n-> n<=3).forEach(System.out::println);
		System.out.println("-------");
		Long s = no.stream().filter(n-> n<=3).count();
		System.out.println(s);
		System.out.println("----------");
		//for sorted
		no.stream().filter(n-> n<=3).sorted().forEach(System.out::println);
//		no.stream().filter(n-> n<=3).sorted((n1,n2)->n2.compareTo(n1)).forEach(System.out::println);
//		no.stream().filter(n-> n<=3).sorted((n1,n2)->-n1.compareTo(n2)).forEach(System.out::println);
		System.out.println("----------");
		List<String> players = Arrays.asList("Virat Kohli","Sachin","Dhonj","Dhoni","Kapil Dev Kapil Dev");
		players.stream().sorted((n1, n2)-> n1.compareTo(n2)).forEach(System.out::println);
		System.out.println("--------");
		//print string based on length order
		Comparator<String> c = (n1,n2) ->{
			int l1 = n1.length();
			int l2 = n2.length();
			if(l1<l2) {
				return -1;
			}
			else if(l1>l2) {
				return 1;
			}
			else return n1.compareTo(n2); 
		};
		
		players.stream().sorted(c).forEach(System.out::println);
		System.out.println("-----------------");
		//print string based on sorted
		players.stream().sorted((n1,n2)-> n1.compareTo(n2)).forEach(System.out::println);
		System.out.println("-----------");
		//find min value
		List<Integer> values = Arrays.asList(10,24,3,2,89,101);
		Integer min = values.stream().min((i1,i2)->i1.compareTo(i2)).get();
//		Integer min = values.stream().min(Integer::compare).get();
		System.out.println(min);
		System.out.println("----------");
		Integer max = values.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
		System.out.println("---------------");
		List<Integer> l = Arrays.asList(10,9,0,5,4,32);
		Integer[] a=l.stream().toArray(Integer[]::new);
		for(Integer i : a) {
			System.out.println(i);
		}
		System.out.println("-----------");
		//if it is array we can convert to stream by using Stream.of(i)
		Stream.of(a).forEach(System.out::println);
		System.out.println("--------");
		//& also we can use stream with more no. of elements
		Stream.of(2,3,4,5,66,53).forEach(System.out::println);
		
		
	}
	
	

}

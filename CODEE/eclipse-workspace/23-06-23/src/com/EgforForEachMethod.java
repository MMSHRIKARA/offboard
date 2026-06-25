package com;

import java.util.ArrayList;
import java.util.List;

public class EgforForEachMethod {
	public static void main(String[] args) {
		List<String> gamesList = new ArrayList();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Kabaddi");
		gamesList.add("Volleyball");
		gamesList.add("Hockey");
//		gamesList.forEach(a->System.out.println(a));//Iterating by passing lambda exp
//		gamesList.forEach(System.out::println);//Iterating by passing method reference
	}

}

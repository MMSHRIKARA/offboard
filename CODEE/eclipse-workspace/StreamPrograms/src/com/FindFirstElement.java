package com;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Kaizer", "Manoj", "Kalkya");
		list.stream().findFirst().ifPresentOrElse(System.out::println, ()-> System.out.println("There is no Element :("));

	}
}

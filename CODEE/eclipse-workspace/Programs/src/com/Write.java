package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Write {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Aftft");
		al.add("bhgjgyg");
		al.add("Ajhgu");
		
		List<String>  s=al.stream().filter(i->i.startsWith("A")).collect(Collectors.toList());
		System.out.println(s);
		
	}

}

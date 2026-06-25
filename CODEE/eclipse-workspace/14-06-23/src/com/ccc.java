package com;
//

//import java.util.ArrayList;
//import java.util.List;
//
//public class ccc {
//	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("Capgemini");
//		list.add("capgemini");
//		list.add("Microsoft");
//		list.add("Amazon");
//	}
//
//}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ccc {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Capgemi");
		list.add("Amazon");
		list.add("Microsoft");
		list.add("capgemini");

		Map<Integer, String> map = new HashMap<>();

		for (String str : list) {
			String lowercaseString = str.toLowerCase();
			int length = str.length();

			if (map.containsKey(length)) {
				if (map.get(length).toLowerCase().equals(lowercaseString)) {
					continue; 
				}
			}

			map.put(length, str);
		}

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
}

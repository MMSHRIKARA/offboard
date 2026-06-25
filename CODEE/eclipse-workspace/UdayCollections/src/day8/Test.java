package day8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap();
		lhm.put(21, "Java");
		lhm.put(27, "JavaScript");
		lhm.put(23, "Sql");
		System.out.println(lhm);
		System.out.println("-----");
		//keySet() is used to set out of the key elements in the hash map.
		Set<Integer> s = lhm.keySet();
		for(Integer key : s) {
			System.out.println(key+" - "+lhm.get(key));
		}
		System.out.println("----------");
		
		HashMap<String, Integer> hm = new HashMap();
		hm.put("dog", 2);
		hm.put("tom", 5);
		hm.put("jerry", 3);
		Set<String> ss = hm.keySet();
		for(String key : ss) {
			System.out.println(key+" - "+hm.get(key));
		}
		
		System.out.println("---------");
		TreeMap<Integer, Double> tm = new TreeMap();
		tm.put(23, 2.3);
		tm.put(21, 1.8);
		tm.put(18, 2.1);
		
		Set<Integer> sss = tm.keySet();
		
		for(Integer key : sss) {
			System.out.println(key+" - "+tm.get(key));
		}
		
	}

}

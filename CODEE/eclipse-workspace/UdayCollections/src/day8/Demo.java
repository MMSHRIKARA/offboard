package day8;

import java.util.HashMap;

public class Demo {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		
		// put() is used to add key & value inside Map
		h.put("guldu", 34);
		h.put(20, "dinga");
		h.put(4.5, "manga");
		
		System.out.println(h);
		System.out.println("----------");
		//get() is used to get an value based on the key specified.
		System.out.println(h.get("guldu"));
		System.out.println(h.get(20));
		System.out.println(h.get(2));
		System.out.println("---------");
		//containsKey() is used to check if the key is present or not
		System.out.println(h.containsKey("Guldu"));
		System.out.println(h.containsKey(20));
		System.out.println("----------");
		//containsValue() is used to check if the value is present or not
		System.out.println(h.containsValue("dinga"));
		System.out.println(h.containsValue(4.5));
		System.out.println("----------");
		System.out.println(h);
		//remove() is used to remove a value based on the key specifed
		h.remove(4.5);
		System.out.println(h);
		System.out.println("---------");
		//isEmpty() is used to check if the collection is empty or not
		System.out.println(h.isEmpty());
		//clear() is used to remove all the objects in collection
		h.clear();
		System.out.println(h.isEmpty());
		System.out.println("---------");
		
		
	}

}

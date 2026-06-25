package day1;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		//add() is used to add an object into collection
		l.add(10);
		l.add(20.32);
		l.add(null);
		l.add(null);
		l.add("Rohon");
		l.add(10);
		System.out.println(l);
		System.out.println("-----");
		//size() is used to return the length of the collection
		System.out.println(l.size());
		System.out.println("-------");
		//get() is used to return an object based on the index position
		System.out.println(l.get(1));
		System.out.println("---------");
//		System.out.println(l.get(23));//IndexOutOfBondsException
		//contains() is used to check if the object is present in the collection or not
		System.out.println(l.contains("Rohon"));
		System.out.println(l.contains("rohon"));
		System.out.println("---------");
		//remove() is used to remove an object based on index
		l.remove(2);
		System.out.println(l);
		System.out.println("-----------");
		// isEmpty() is used to check whether the collection is empty or not
		System.out.println(l.isEmpty());
		//clear() will removes all the objects in collection
		l.clear();
		System.out.println(l.isEmpty());
		System.out.println("--------");
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(null);
		x.add(10);
		x.add("Manoj");
		x.add(20.00);
		x.add(90);
		System.out.println(x);
		System.out.println("----------");
		//indexOf() is used to find the index position of an object & first occurence in case of duplication
		System.out.println(x.indexOf(10));
		System.out.println(x.indexOf(80));//-1 if the object is not present in collection
		System.out.println("-------");
		//lastIndexOf() is used to find the last index position of an oject & first last occurence in case of duplication
		System.out.println(x.lastIndexOf(10));
		
	}

}

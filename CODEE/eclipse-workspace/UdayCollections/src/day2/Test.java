package day2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		System.out.println(l);
		System.out.println("-------------");
		
		LinkedList ll = new LinkedList();
		//addAll() is used to add all the objects of one collection into another collection.
		ll.addAll(l);
		ll.add(30);
		System.out.println(ll);
		System.out.println("-----------");
		//containsAll() is used to check all the objects of one collection is present or not
		System.out.println(ll.containsAll(l));
		System.out.println("-----------");
		//removeAll() is used to remove all the objects of one collection from another collection.
		ll.removeAll(l);
		System.out.println(ll);
		System.out.println("--------");
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		//add() is used to add an object based on the index position
		//already existing object gets shifted to the next position
		ll.add(1,35);
		System.out.println(ll);
		System.out.println("----------");
		//set() is used to add an object based on the index position
		//already exisiting object will be overridden
		ll.set(1, 36);
		System.out.println(ll);
		
		
		
		
	}

}

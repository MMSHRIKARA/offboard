package day4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

//Constructors of ArrayList, LinkedList, Vector
public class Constructors {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();//if no argument is given means default initial capacity will be assigned.
		
		ArrayList b = new ArrayList(30);//if argument is given means the initial capacity will be given by programmer.
		
		LinkedList c = new LinkedList();
		
		Vector f = new Vector();//if no argument is given means default initial capacity will be assigned.
		
		Vector g = new Vector(20);//if argument is given means the initial capacity will be given by programmer.
		
		Vector h = new Vector(20, 5);//first arg is initial capacity of array & second arg is increasing size of incremental capacity i.e. [currentcapacity * 5].
		
		System.out.println("-------------------------------------------------");
		
		ArrayList x = new ArrayList();
		x.add(10);
		System.out.println(x);
		
		LinkedList y = new LinkedList(x);//argument is trying to add one collection to another collection
		y.add(20);
		System.out.println(y);
		
		Vector z = new Vector(y);
		z.add(30);
		System.out.println(z);
		
		
	}

}


/*
 * Constructors :
 * ---------------
 * 
 * ArrayList()
 * ArrayList(int initialCapacity)
 * ArrayList(collection c)
 * 
 * LinkedList()
 * LinkedList(collection c)
 * 
 * Vector()
 * Vector(int initialCapacity)
 * Vector(int initialCapacity, int incrementalCapacity)
 * Vector(collection c)
 * 
 * 
 */
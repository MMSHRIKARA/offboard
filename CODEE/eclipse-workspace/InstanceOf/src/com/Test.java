package com;

public class Test {
	public static void main(String[] args) {
		System.out.println(new Son() instanceof Son);
		System.out.println(new Son() instanceof Father);
		System.out.println(new Father() instanceof Son);
		System.out.println(new Father() instanceof Daughter);
		System.out.println("------");
		Son s = new Son();
		System.out.println(s instanceof Son);
		System.out.println(s instanceof Father);
		System.out.println("------------");
		Daughter d = new Daughter();
		System.out.println(d instanceof Daughter);
		System.out.println(d instanceof Father);
		System.out.println("-----------");
		Father f = new Father();
		System.out.println(f instanceof Father);
		System.out.println(f instanceof Son);
		System.out.println(f instanceof Daughter);
	}

}

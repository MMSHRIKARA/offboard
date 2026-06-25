package com;

public class StaticVariable {
	static int x = 10;
	int y = 20;
	static {
		System.out.println("SB-1");
	}
	{
		System.out.println("NSB-1");
	}
	public static void main(String[] args) {
		System.out.println("HEllo");
		System.out.println(StaticVariable.x);
		StaticVariable sv = new StaticVariable();
		System.out.println(sv.y);
	}

}

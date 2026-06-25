package com;

public class StaticBlocks {
	static {
		System.out.println("S B -1");
	}
	static {
		System.out.println("S B -2");
	}
	public static void main(String[] args) {
		System.out.println("Hello Static Blocks");
		
	}
	static {
		System.out.println("S B -3");
	}

}

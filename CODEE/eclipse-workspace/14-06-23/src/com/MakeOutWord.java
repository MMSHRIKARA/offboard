package com;

public class MakeOutWord {
	public static void main(String[] args) {
		String str = "Raju";
		String s = "<<>>";
		String res = s.substring(0,2)+str+s.substring(2);
		System.out.println(res);
	}

}

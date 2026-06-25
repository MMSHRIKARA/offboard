package com;
interface CheckString{
	boolean check(String a);
}
public class CheckStringIsEmpty {
	public static void main(String[] args) {
		CheckString cs = (a) -> (a.isEmpty());
//		CheckString cs = (a) -> {
//			return a.isEmpty();
//		};
		System.out.println(cs.check(" "));
	}

}

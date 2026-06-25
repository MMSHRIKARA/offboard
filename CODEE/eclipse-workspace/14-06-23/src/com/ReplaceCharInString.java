package com;

public class ReplaceCharInString {

	public static void main(String[] args) {
		String str = "apple";
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				s = s + "b";
			} else if (str.charAt(i) == 'p') {
				s = s + "q";
			} else {
				s = s + str.charAt(i);
			}

		}
		System.out.println(s);
	}
}

//public class ReplaceCharInString {
//	public static void main(String[] args) {
//		String s = "apple";
//		String rep = "";
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == 'a') {
//				rep = s.replace('a', 'b');
//
//			}
//
//		}
//		for (int j = 0; j < s.length(); j++) {
//			if (rep.charAt(j) == 'p') {
//				rep = rep.replace('p', 'q');
//			}
//
//		}
//		System.out.println(rep);
//	}
//}



package com;
public class CountWords{
	public static void main(String[] args) {
		String sentence = "    Beauty lies in the eyes of beholder  ";
		String str = sentence.strip();
		String s[] = str.split(" ");
		System.out.print("No of Words : ");
		System.out.println(s.length);
	}
}
//		int count=0;
//		for(int i=0; i<s.length; i++) {
//			count++;
//			
//		}
//		System.out.println(count);

//public class CountWords {
//
//	public static void main(String[] args) {
//		String sentence = " Beauty lies in the eyes of beholder";
//		String str = sentence.strip();
//		String[] s = str.split(" ");
//
//		int count = 0;
//		for (int i = 0; i < s.length; i++) {
//			count++;
////			System.out.println(s[i]);
//		}
//		System.out.println(count);
//
//	}
//}


package com;

//public class OccurenceLetter {
//	public static void main(String[] args) {
//		String str="Eldorado";
//		char c = 'o';
//		int count = 0;
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i)==c) {
//				count++;
//			}
//		}
//		System.out.println(count);
//		
//	}
//
//}


public class OccurenceLetter{
	public static void main(String[] args) {
		String str = "TataDocomo";
		char c = 'o';
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==c) {
				count++;
				
			}
		}
//		System.out.println(count);
		System.out.println(c+"-"+count);
	}
}
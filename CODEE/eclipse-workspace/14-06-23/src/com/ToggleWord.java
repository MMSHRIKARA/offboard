package com;

public class ToggleWord {
	public static void main(String[] args) {
//		String arr[] = { "TYu", "yUi", "tyu" };
		String arr[] = {"Rohan", "KAIZER", "rAJU", "Reddy"};
		for (int i = 0; i <arr.length; i++) {
			char ch[] = arr[i].toCharArray();

//			if (Character.isLowerCase(ch[1])) {
//				ch[1] = Character.toUpperCase(ch[1]);
//
//			} else if (Character.isUpperCase(ch[1])) {
//				ch[1] = Character.toLowerCase(ch[1]);
//			}
			if(Character.isUpperCase(ch[1])) {
				ch[1]=Character.toLowerCase(ch[1]);
			}
			else if(Character.isLowerCase(ch[1])) {
				ch[1]=Character.toUpperCase(ch[1]);
			}
			
			
			arr[i] = new String(ch);
			System.out.print(arr[i] + " ");
		}
//		
	}
}

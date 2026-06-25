package com;

public class SnakeCase {
	public static void main(String[] args) {
		String str = "My Name is Kaizer";
		System.out.println("I/P : "+str);
		System.out.print("O/P : ");
		char[] arr = str.toCharArray();
		arr[0] = Character.toLowerCase(arr[0]);
		for(int i=0; i<str.length(); i++) {
			if(arr[i]==' ') {
				arr[i+1]=Character.toLowerCase(arr[i+1]);
				System.out.print("_");
			}else {
				
			System.out.print(arr[i]);
			}
		}
	}

}

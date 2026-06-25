package com;

public class ToggleWord {
	public static void main(String[] args) {
		String[] str = { "SHivu", "Surendra", "SAngamesh", "Kaizer" };
		for (int i = 0; i < str.length; i++) {
			char[] ch = str[i].toCharArray();
			if (Character.isUpperCase(ch[1])) {
				ch[1] = Character.toLowerCase(ch[1]);
				
			}
			else{
				ch[1] = Character.toUpperCase(ch[1]);
			}
			

			str[i] = new String(ch); 
			System.out.print(str[i]+" ");
			
		}
	}
}

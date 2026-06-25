package com;

//camelCase --> snake_case
public class CnvrtCamelCastToSnakeCaseUStringMethods {
	public static void main(String[] args) {
		String sentence = "   welcomeToCapgemini,HaveAGoodDay ";

		String str = sentence.strip();
		char ch[] = str.toCharArray();
		String s = "";
		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])) {
				s = "_" + Character.toLowerCase(ch[i]);
				System.out.print(s);

			} else {
				System.out.print(ch[i]);
			}
		}
	}

}

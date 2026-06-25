package com;

public class CountWordsInSentence {
	public static void main(String[] args) {
		String str = "Kalsubai is the highest peak of Maharashtra";
		String str1[] = str.split(" ");
		System.out.println("No. of Words : "+str1.length);
	}

}

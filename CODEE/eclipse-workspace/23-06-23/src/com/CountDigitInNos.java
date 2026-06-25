package com;

public class CountDigitInNos {
	public static void main(String[] args) {
		long n = 863330868478l;
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;

		}
		System.out.println(count);
	}

}

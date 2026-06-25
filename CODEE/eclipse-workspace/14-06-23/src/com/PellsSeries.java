package com;
//1 2 5 12 29 70 169
public class PellsSeries {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int c = 0;
		for (int i = 0; i <= 10; i++) {
			c = a + (b * 2);
			a = b;
			b = c;
			System.out.println(c);

		}
	}
}
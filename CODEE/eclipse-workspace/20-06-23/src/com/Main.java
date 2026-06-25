package com;

//interface Main {
//	void factorial(int a);
//}
//
//class Fac {
//
//	public static void main(String[] args) {
//		Main m = (int a) -> {
//			int result = 1;
////			int n = 5;
//			for (int i = 1; i <= a; i++) {
//				result = result * i;
//			}
//			System.out.println(result);
//
//		};
//		m.factorial(6);
//	}
//}

interface Factorial{
	void fact(int n);
}
public class Main{
	public static void main(String[] args) {
		Factorial f = (int n) ->{
			int result = 1;
			for(int i=1; i<=n; i++) {
				result *= i;
			}
			System.out.println(result);
		};
		f.fact(5);
	}
}
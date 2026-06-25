package com;
interface SumCalculator{
	int calculateSum(int a, int b);
}
class LambdaSumExample{
	public static void main(String[] args) {
		SumCalculator sum = (a,b)->(a+b);
//		SumCalculator sum = (a,b)->{
//			int add = a+b;
//			return add;
//		};
		System.out.println(sum.calculateSum(2, 3));
			
		
	}
}
package com;

interface SumCalculator{
	int calculateSum(int a, int b);
}
class LambdaSumExample{
	public static void main(String[] args) {
//		SumCalculator sum = (a,b)->{
//			int add = a+b;
//			return add;
//		};
		SumCalculator sum = (a,b)->(a+b);
		System.out.println(sum.calculateSum(2, 3));
			
		
	}
}



//interface SumCalculator{
//	int sumCalculate(int a, int b); 
//}
//class LambdaSum{
//	public static void main(String[] args) {
//		SumCalculator add = (a,b)->{
//			int sum = a+b;
//			return sum;
//			
//		};
//		System.out.println(add.sumCalculate(2, 3));
//		
//	}
//}
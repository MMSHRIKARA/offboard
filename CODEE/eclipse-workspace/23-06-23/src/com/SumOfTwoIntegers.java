package com;

@FunctionalInterface
interface ArithmeticOperationSum {
	int sum(int a, int b);
}

class SumOfTwoIntegers {
	public static void main(String[] args) {
		ArithmeticOperationSum aOper = (a, b) -> (a + b);
		System.out.println(aOper.sum(5, 6));
	}

}

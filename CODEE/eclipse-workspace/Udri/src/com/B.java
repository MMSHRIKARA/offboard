package com;
interface P1{
	default void print() {
		System.out.println("Parent 1");
	}
}
interface P2{
	default void print() {
		System.out.println("Parent 2");
	}
}
class P3 implements P1,P2{

	@Override
	public void print() {
		P1.super.print();
		P2.super.print();
	}
	public static void main(String[] args) {
		P3 p = new P3();
		p.print();
	}
	
}



//package com;
//interface P1{
//	 void print();
//}
//interface P2{
//	 void print();
//}
//class P3 implements P1,P2{
//
//	
//	public void print() {
//		System.out.println("Print");
//		
//	}
////	@Override
////	public void print() {
////		P1.super.print();
////		P2.super.print();
////	}
//	public static void main(String[] args) {
//		P3 p = new P3();
//		p.print();
//	}
//	
//}
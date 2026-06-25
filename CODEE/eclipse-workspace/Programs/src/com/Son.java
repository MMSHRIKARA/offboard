package com;
//Method Overloading
//public class Son extends Father{
//	int x = 20;
//	void display() {
//		int x =b
//Method Overriding
//public class Son extends Father{
//	@Override
//	void bike() {
//		System.out.println("Son's bike");
//	}
//	void eat() {
//		System.out.println("Son is Eating");
//	}
//}

//Implicit Constructor Chaining
//public class Son extends Father{
//	Son(){
//		//implicitly super();
//		System.out.println(2);
//	}
//}

//Explicit Constructor Chaining
public class Son extends Father{
	Son(){
		super(100); 
//		super('d');
		System.out.println(2);
	}
}
package package2;

import package1.*;

public class Child extends Sample {
	
	void helper() {
		System.out.println(year);
		printYear();
		System.out.println(Sample.tittle);
	}

	public static void main(String[] args) {
	
		Child child=new Child();
		child.helper();
		
		child.printYear();
		
		
	}
	
}

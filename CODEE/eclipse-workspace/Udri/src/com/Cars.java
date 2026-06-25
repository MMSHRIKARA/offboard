package com;

class Cars {
	static int cost = 1200000;
	String color = "Red";

	protected void condition() {
		System.out.println("Car is in good condition.");
	}

	void condition(int n) {
		System.out.println("Car is in very good condition");
	}
	Cars()
	{
		System.out.println("Car is good");
	}

	public static void main(String[] args) {
		Cars c = new Cars();
		System.out.println(cost);
		Cars c1 = new Cars();
		System.out.println(c1.cost);
		System.out.println(c.color);
		c.condition();
		c.condition(2);
		System.out.println("------------");
		Suzuki s = new Suzuki();
		System.out.println(s.color);
		System.out.println(Suzuki.cost);
		
		s.condition();
		s.condition1();
		
	}

}

class Suzuki extends Cars {

	static int cost = 130000;
//	String color = "Yellow";
	
	@Override
	protected void condition() {
		System.out.println("Suzuki is in good condition");

	}
	int condition1() {
		System.out.println("from condition-1");
		return 1;
	}

}
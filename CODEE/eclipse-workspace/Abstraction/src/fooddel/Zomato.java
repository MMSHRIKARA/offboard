package fooddel;

public class Zomato implements FoodDeliveryApp{
	@Override 
	public void orderFood() {
		System.out.println("Ordering food using Zomato App");
	}
	@Override
	public void cancelFood() {
		System.out.println("Cancelling food using Zomato App");
	}

}

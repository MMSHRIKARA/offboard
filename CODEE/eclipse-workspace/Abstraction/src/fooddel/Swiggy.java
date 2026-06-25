package fooddel;

public class Swiggy implements FoodDeliveryApp {
	@Override
	public void orderFood() {
		System.out.println("Ordering food using Swiggy App");

	}

	@Override
	public void cancelFood() {
		System.out.println("Cancelling food using Swiggy App");

	}

}

package fooddel;

public class MagicPin implements FoodDeliveryApp{
	@Override
	public void orderFood() {
		System.out.println("Ordering food using Magicpin App");
	}
	@Override
	public void cancelFood() {
		System.out.println("Cancelling food using Magicpin App");
	}

}

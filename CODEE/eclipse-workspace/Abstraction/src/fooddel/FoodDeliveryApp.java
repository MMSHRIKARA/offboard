package fooddel;

public interface FoodDeliveryApp {
	void orderFood();
	abstract void cancelFood();//there is no use of using abstract keyword because any method inside interface will be automatically abstract so.
	

}

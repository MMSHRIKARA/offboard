package fooddel;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Mobile mbl = new Mobile();
		System.out.println("Enter choice : \ns : Swiggy \nz : Zomato \nm : MagicPin");
		char choice = s.next().charAt(0);
		FoodDeliveryApp f = mbl.decideApp(choice);
		if (f != null) {
			f.orderFood();
			f.cancelFood();
		}

	}

}

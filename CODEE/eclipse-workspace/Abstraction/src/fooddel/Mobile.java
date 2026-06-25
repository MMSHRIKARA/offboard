package fooddel;

public class Mobile {
	FoodDeliveryApp f;
	FoodDeliveryApp decideApp(char choice) {
		if(choice == 's') {
			f = new Swiggy();
		}
		else if(choice == 'z') {
			f = new Zomato();
		}
		else if(choice == 'm') {
			f = new MagicPin();
		}
		else {
			System.out.println("Invalid choice");
		}
		return f;
			
	}
	

}

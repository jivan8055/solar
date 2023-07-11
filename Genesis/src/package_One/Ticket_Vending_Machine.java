package package_One;

import food.FoodChoice;
import routes.Routes;

public class Ticket_Vending_Machine {
	public static void main(String[] args) {
		Routes obj1 = new Routes();
		FoodChoice obj2 = new FoodChoice();
		obj1.routeLines();
		obj2.foodSelection();
		
	}
}

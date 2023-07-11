package food;

import java.util.Scanner;

public class FoodChoice {
	Scanner scan = new Scanner(System.in);
	public void foodSelection() {
		FoodChoice obj2 = new FoodChoice();
		System.out.println("**  ENTER YOUR FOOD TYPE  **");
		System.out.println("--PRESS 1 FOR VEG FOOD--"+"\n"+"--PRESS 2 FOR NON-VEG FOOD--");
		int foodTypeSelection = scan.nextInt();
		switch(foodTypeSelection) {
		case 1: obj2.vegFood(); break;
		case 2: obj2.nonVegFood(); break;
		}
	}
	public void vegFood() {
		System.out.println("**  ENTER YOUR CHOICE FOOD NUMBER  **");
		String [] vItems= {"Dal Khidadi","Paneer koliwada","Paneer Masala","Veg Kolhapuri","Matar Paneer"};
		int [] vPrice = {120,220,180,190,200};
		int n=1;
		for(int i=0;i<vItems.length;i++){
			System.out.println(n+") "+vItems[i]+".......... "+vPrice[i]+" Rs.");
			n++;
		}
		int selection = scan.nextInt();
		System.out.println(" YOU SELECTED "+vItems[selection-1]);
		int vAmount = vPrice[selection-1];
	}
	public void nonVegFood() {
		System.out.println("**  ENTER YOUR CHOICE FOOD NUMBER  **");
		String [] nItems= {"Chicken Handi","Chicken Biryani","Mutton Biryani","Chicken Shorama","Khima"};
		int [] nPrice = {220,180,230,55,260};
		int n=1;
		for(int i=0;i<nItems.length;i++){
			System.out.println(n+") "+nItems[i]+".......... "+nPrice[i]+" Rs.");
			n++;
		}
		int selection = scan.nextInt();
		System.out.println(" YOU SELECTED "+nItems[selection-1]);
		int vAmount = nPrice[selection-1];
	}
}

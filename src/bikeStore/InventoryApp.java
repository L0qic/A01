package bikeStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InventoryApp {

	private static Scanner scan = new Scanner(System.in);
	private static Inventory inv = new Inventory("Bikes");
	
	private static void displayBicycles() {
		for (Bicycle element : inv.getBicycles()) {
			System.out.println(element);
		}
		System.out.println();
	}
	
	private static void addBicycle() {
		System.out.println("Year: ");
		int a = scan.nextInt();
		System.out.println("Make: ");
		scan.nextLine();
		String b = scan.nextLine();
		System.out.println("Model: ");
		String c = scan.nextLine();
		inv.add(new Bicycle(a, b, c));
		System.out.println();
	}
	
	/**
	 * Removes a bicycle from the ArrayList<Bicycle> from an id. 
	 * If the id does not exist it returns not found
	 * @param bicycles
	 * @param bikeId
	 */
	
	private static void remove(ArrayList<Bicycle> bicycles, int bikeId) {
		int index = inv.bicycleSearch(bicycles, bikeId);
		if (index >= 0) {
			Bicycle s = inv.getBicycles().get(index);
			System.out.printf("%s %s %s removed %n%n", s.year, s.make, s.model);
			bicycles.remove(index);
		} else {
			System.out.printf("Bicycle Id: \"%d\" not found %n%n", bikeId);
		}
	}
	
	/**
	 * searches the ArrayList<Bicycle> from an id. 
	 * If the id does not exist it returns not found.
	 * 
	 * @param bicycles
	 * @param bikeId
	 */
	private static void find(ArrayList<Bicycle> bicycles, int bikeId) {
		int index = inv.bicycleSearch(bicycles, bikeId);
		if (index >= 0) {
			System.out.printf("%s%n%n", inv.getBicycles().get(index));
		} else {
			System.out.printf("Bicycle with Id: \"%d\" not found %n", bikeId);
		}
	}
	
	private static void searchBicycleById() {
		System.out.println("Find Bicycle with Id: ");
		int findBikeId = scan.nextInt();
		find(inv.getBicycles(), findBikeId);
		System.out.println("");
	}
	
	private static void removeBicycleById(){
		System.out.println("Remove Bicycle with Id: ");
		int removeBikeId = scan.nextInt();
		remove(inv.getBicycles(), removeBikeId);
	}
	
	private static void bicycleCount() {
		System.out.printf("Number of Bicycles: %s%n%n", inv.getBicycles().size());
	}
		
	private static void throwErrFromSelection() {
		System.out.println("Error: Enter a selection 1 - 6\n");
	}
	
	private static void mainMenu() {
		inv.add(new Bicycle(1974, "Schwinn", "Le Tour"));
		inv.add(new Bicycle(1975, "Huffy", "Thunder Road"));
		inv.add(new Bicycle(1979, "Cornelo", "Super"));

		int menu = 0;
		while (menu != 6) {
			ArrayList<String> theMenu;
			theMenu = new ArrayList<String>(Arrays.asList(
					"1. Display all items", "2. Add an item", "3. Find an item", 
					"4. Delete an item", "5. Number of items", "6. Exit", 
					"Enter your selection: "));
			for (String s : theMenu) {
		         System.out.print(s + "\n");
		    }
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				displayBicycles();
				break;
			case 2:
				addBicycle();
				break;
			case 3:
				searchBicycleById();
				break;
			case 4:
				removeBicycleById();
				break;
			case 5:
				bicycleCount();
				break;
			case 6:
				break;
			default:
				throwErrFromSelection();
				break;
			}
		}
		
		System.out.println("Goodbye");
		scan.close();
		
	}

	public static void main(String[] args) {
		mainMenu();
	}
}

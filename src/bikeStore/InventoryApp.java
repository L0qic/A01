package bikeStore;

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryApp {

	private static Scanner scan = new Scanner(System.in);
	private static Inventory inv = new Inventory("Bikes");
	
	private static void displayBicycles() {
		for (Bicycle element : inv.getBicycles()) {
			System.out.println(element);
		}
		System.out.println("\n");
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
	
	private static void remove(ArrayList<Bicycle> bicycles, int bikeId) {
		int index = inv.bicycleSearch(bicycles, bikeId);
		if (index >= 0) {
			bicycles.remove(index);
		} else {
			System.out.printf("Bike ID: %d does not exist%n", bikeId);
		}
	}

	private static void find(ArrayList<Bicycle> bicycles, int bikeId) {
		System.out.println("Find bike with ID Number: ");
		int index = inv.bicycleSearch(bicycles, bikeId);
		if (index >= 0) {
			System.out.printf("%s%n%n", inv.getBicycles().get(index));
		} else {
			System.out.printf("Bicycle with ID: \"%d\" could not be found", bikeId);
		}
	}
	
	private static void searchBicycleById() {
		System.out.println("Find bike with Id: ");
		int findBikeId = scan.nextInt();
		find(inv.getBicycles(), findBikeId);
		System.out.println();
	}
	
	private static void removeBicycleById(){
		System.out.println("Remove bike with Id: ");
		int removeBikeId = scan.nextInt();
		remove(inv.getBicycles(), removeBikeId);
	}
	
	private static void bicycleCount() {
		System.out.printf("Number of bikes: %s%n%n", inv.getBicycles().size());
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
			System.out.println("1. Display all items");
			System.out.println("2. Add an item");
			System.out.println("3. Find an item");
			System.out.println("4. Delete an item");
			System.out.println("5. Number of items");
			System.out.println("6. Exit");
			System.out.println("Enter your selection: ");
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

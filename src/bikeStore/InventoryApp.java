package bikeStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InventoryApp {

	private static Scanner scan = new Scanner(System.in);
	private static Inventory inv = new Inventory("Bikes");

	private static void displayBicycles() {
		if (inv.getBicycles().isEmpty()) {
			System.out.printf("There are no bicycles to list");
		} else {
			inv.getBicycles().forEach(bicycle -> System.out.printf("%n%s", bicycle));
			System.out.printf("%n%n");
		}
	}

	private static void addBicycle() {
		int year = 0;
		String make, model;
		try {
			System.out.println("Year: ");
			year = scan.nextInt();
			System.out.println("Make: ");
			scan.nextLine();
			make = scan.nextLine();
			System.out.println("Model: ");
			model = scan.nextLine();
			inv.add(new Bicycle(year, make, model));
		} catch (InputMismatchException e) {
			System.out.printf("ERROR: Input is not a valid year. Please try again %ne.g 2017%n");
			scan.nextLine();
		}
		System.out.println();
	}

	private static void searchBicycleById() {
		System.out.println("Find Bicycle with Id: ");
		int findBikeId = scan.nextInt();
		inv.find(inv.getBicycles(), findBikeId);

	}

	private static void removeBicycleById() {
		System.out.println("Remove Bicycle with Id: ");
		int removeBikeId = scan.nextInt();
		inv.remove(inv.getBicycles(), removeBikeId);
	}

	private static void bicycleCount() {
		System.out.printf("Number of Bicycles: %s%n%n", inv.getBicycles().size());
	}

	private static void throwErrFromSelection() {
		System.out.println("Error: Enter a selection 1 - 6\n");
	}

	private static void mainMenu() {
		int menu = 0;
		while (menu != 6) {
			ArrayList<String> theMenu;
			theMenu = new ArrayList<String>(
					Arrays.asList("1. Display all bicycles", "2. Add a bicycle", "3. Find a bicycle",
							"4. Delete a bicycle", "5. Number of bicycles", "6. Exit", "Enter your selection: "));
			theMenu.forEach(opt -> System.out.printf("%s%n", opt));

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
				System.out.println("Goodbye");
				scan.close();
				break;
			default:
				throwErrFromSelection();
				break;
			}
		}
	}

	public static void main(String[] args) {
		inv.add(new Bicycle(1974, "Schwinn", "Le Tour"));
		inv.add(new Bicycle(1975, "Huffy", "Thunder Road"));
		inv.add(new Bicycle(1979, "Cornelo", "Super"));
		inv.add(new Bicycle(1983, "SE", "Racing Quadangle"));
		
		mainMenu();
	}
}

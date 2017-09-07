package bikeStore;

import java.util.Scanner;

public class InventoryApp {
	
	private static Scanner scan;

	public static void main(String[] args){
		Inventory inv = new Inventory("Bikes");
		inv.add(new Bicycle(1974 , "Schwinn", "Le Tour"));
		inv.add(new Bicycle(1975 , "Huffy", "Thunder Road"));
		inv.add(new Bicycle(1979 , "Cornelo", "Super"));
        scan = new Scanner(System.in);
		
		int menu = 0;
		while(menu != 6) {
			System.out.println("1. Display all items");
            System.out.println("2. Add an item");
            System.out.println("3. Find an item");
            System.out.println("4. Delete an item");
            System.out.println("5. Number of items");
            System.out.println("6. Exit");
            System.out.println("Enter your selection: ");
			menu = scan.nextInt();
 
			switch(menu){
		        case 1:
		        	for (Bicycle element : inv.getBicycles()) {
		        	    System.out.println(element);
		        	}
		        	System.out.println("\n");
		        	break;
		        case 2:
		        	
		        	// We need to use BufferedReader here since strings with spaces
		        	// are cut off?
		        	
		        	System.out.println("Year: ");
		        	int a = scan.nextInt();
		        	System.out.println("Make: ");
		        	String b = scan.next();
		        	System.out.println("Model: ");
		        	String c = scan.next();
		        	inv.add(new Bicycle(a, b, c));
		        	break;
		        case 3:
		        	System.out.println("Id: ");
		        	a = scan.nextInt();
		        	System.out.println("Bike: " + inv.find(a));
		        	break;
		        case 4:
		        	break;
		        case 5:
		        	inv.itemCount();
		        	break;
		        case 6:
		        	break;
		        default: 
		        	System.out.println("Error: Enter a selection 1 - 6\n");
		           break;
		           }
			}
		System.out.println("Goodbye");
		scan.close();
	}
}

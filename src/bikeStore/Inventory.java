package bikeStore;

import java.util.ArrayList;

/**
 * Represents an inventory of bicycles.
 *
 * @author pdah
 *
 */

public class Inventory {
	private String name;
	private ArrayList<Bicycle> bicycles;

	/**
	 * Initialized the name of with the value provided. A new instance of Inventory
	 * has no items.
	 *
	 * @param name
	 */

	public Inventory(String name) { // can initialize any number of fields
		this.name = name;
		bicycles = new ArrayList<Bicycle>();
	}

	/**
	 * Returns the value of the field name.
	 *
	 * @return
	 */

	public String getName() {
		return name;
	}

	/**
	 * Returns the value of the field bicycles
	 *
	 * @return
	 */

	public ArrayList<Bicycle> getBicycles() {
		return bicycles;
	}

	/**
	 * Adds a bicycle to the list of bicycles
	 *
	 * @param bicycle
	 */

	public void add(Bicycle bicycle) {
		bicycles.add(bicycle);
	}


	public int bicycleSearch(ArrayList<Bicycle> bicycles, int id) {
		int bikeIndex = -1;
		int findId = id;
		int index = 0;
		if (!bicycles.isEmpty()) {
			for (Bicycle bike : bicycles) {
				if (bike.getId() == findId) {
					bikeIndex = index;
				} else {
					index++;
				}
			}

		}
		return bikeIndex;
	}

	void bicycleCount() {
		System.out.printf("Number of bikes: %s%n%n",getBicycles().size());
	}

	/**
	 * Prints the invoice that lists the name as a header and all bicycles in
	 * individual lines.
	 * 
	 * @return
	 */

	public ArrayList<Bicycle> printInvoice() {
		return getBicycles();
	}

}

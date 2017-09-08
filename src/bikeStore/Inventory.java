package bikeStore;

import java.util.ArrayList;

/**
 * Represents an inventory of bicycles.
 *
 * @author pdah
 *
 */

public class Inventory {
	private ArrayList<Bicycle> bicycles;

	/**
	 * Initialized the name of with the value provided. A new instance of Inventory
	 * has no items.
	 *
	 * @param name
	 */

	public Inventory(String name) {
		bicycles = new ArrayList<Bicycle>();
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

	/**
	 * Searches the ArrayList<Bicycle> from an id.
	 * Returns the associated index
	 * 
	 * @param bicycles
	 * @param id
	 * @return
	 */
	
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
}

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
	 * searches the ArrayList<Bicycle> from an id. If the id does not exist it
	 * returns not found.
	 * 
	 * @param bicycles
	 * @param bikeId
	 */
	public void find(ArrayList<Bicycle> bicycles, int bikeId) {
		int index = bicycleSearch(bicycles, bikeId);
		if (index >= 0) {
			System.out.printf("%s%n%n", getBicycles().get(index));
		} else {
			System.out.printf("Bicycle with Id: \"%d\" not found %n", bikeId);
		}
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
	 * Removes a bicycle from the ArrayList<Bicycle> from an id. If the id does not
	 * exist it returns not found
	 * 
	 * @param bicycles
	 * @param bikeId
	 */

	public void remove(ArrayList<Bicycle> bicycles, int bikeId) {
		int index = bicycleSearch(bicycles, bikeId);
		if (index >= 0) {
			Bicycle s = getBicycles().get(index);
			System.out.printf("%s %s %s removed %n%n", s.year, s.make, s.model);
			bicycles.remove(index);
		} else {
			System.out.printf("Bicycle Id: \"%d\" not found %n%n", bikeId);
		}
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


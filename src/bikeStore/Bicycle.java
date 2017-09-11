package bikeStore;

/**
 * Implements Bicycle class that takes three arguments 
 * year, make and model and generates a unique id.
 * 
 * @author pdah
 *
 */

public class Bicycle {

	public int year;
	public String make;
	public String model;
	int id = 12345678;
	private static int count = 0;

	public Bicycle(int year, String make, String model) {
		this.year = year;
		this.make = make;
		this.model = model;
		id += count++;
	}
	
	/**
	 * Returns the year of the Bicycle
	 * 
	 * @return
	 */

	public int getYear() {
		return year;
	}
	
	/**
	 * Returns the Make of the Bicycle
	 * 
	 * @return
	 */

	public String getMake() {
		return make;
	}
	
	/**
	 * Returns the Model of the Bicycle
	 * 
	 * @return
	 */

	public String getModel() {
		return model;
	}
	
	/**
	 * Return the id of the Bicycle
	 * @return
	 */

	public int getId() {
		return id;
	}
	
	/**
	 * Overrides the toString method for Bicycle class
	 */

	@Override
	public String toString() {
		return year + " " + make + " " + model + " id:" + id;
	}
}

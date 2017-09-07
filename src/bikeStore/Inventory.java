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
     * Initialized the name of with the value provided.
     * A new instance of Inventory has no items.
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

    public void remove(Bicycle bicycle) {
        bicycles.remove(bicycle);
    }
    
    public void find(Bicycle bicycle) {
        // bicycles.find(bicycle);
    }
    
    int find(int a) {
    	return 0; // TODO
    }
    
    void itemCount() {
    	System.out.println("Number of bikes: "
    			+ getBicycles().size()
    			+ "\n");
    }
    /**
     * Prints the invoice that lists the name as a header
     * and all bicycles in individual lines.
     * @return 
     */

    public ArrayList<Bicycle> printInvoice() {
    	return getBicycles();
    }

}

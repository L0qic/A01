package bikeStore;

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
        id = id + count++;
	}
    
    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    @Override
	public String toString() {
		return year + " " + make + " " + model + " id:" + id;
	}
}
	
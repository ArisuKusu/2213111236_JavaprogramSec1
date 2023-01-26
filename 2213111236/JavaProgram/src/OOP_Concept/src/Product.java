
public class Product {
	private String id;
	private int unit;
	private double price;
	
	public void setId (String ID) {
		id = ID;
	}
	public String getID() {
		return id;
	}
	public void setUnit(int Unit) {
		unit = Unit;
	}
	public int getUnit() {
		return unit;
	}
    public void setPrice(double PRICE) {
		price = PRICE;
	}
    public double getPrice() {
    	return price;
    }
    public double calculate() {
    	double result = unit * price;
    	return result;
    }

	

}

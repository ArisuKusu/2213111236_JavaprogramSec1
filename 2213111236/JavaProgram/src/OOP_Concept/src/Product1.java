
public class Product1 {
	private int unit;
	
	public void setUnit(int Unit) {
		this.unit = unit;
	}
	public int getUnit() {
		return unit;
	}
	public int getTotalprice() {
		return this.unit * 100;
	}
	public String toString() {
		return "You buy "+getUnit()+" units("+ getTotalprice()+").";
	}

}

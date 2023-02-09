
public class PattanakarnBranch extends Product1{
	
	private int payUnit() {
		
	}
	private int freeUnit() {
		return super.getUnit() = this.payUnit();
	}
	public int gettotalprice() {
		return this.payUnit() * 100;
	}
	public String toString() {
		return "You buy "+payUnit()+" units, get free "+freeUnit()+" units("+getTotalprice()+")";
	}

}

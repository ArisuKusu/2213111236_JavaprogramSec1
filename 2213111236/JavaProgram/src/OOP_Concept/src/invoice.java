
public class invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	public invoice(int id ,Customer customer,double amount) {
		this.id=id;
		this.customer=customer;
		this.amount=amount;
		
	}
	public int getID() {
		return id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount=amount;
	}
	public int getCustomerID() {
		
	}
	public String getCustomerName() {
		
	}
	public int getCustomerDiscount() {
		
	}

}

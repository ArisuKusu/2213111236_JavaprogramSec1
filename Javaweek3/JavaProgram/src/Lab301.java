import javax.swing.*;
import java.text.*;

public class Lab301 {
    static final int pricePerson = 299;
	public static void main(String[] args) {
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		double totalPrice = pricePerson * numberofCustomer;
		int memberCard;
		do {
		      memberCard = JOptionPane.showConfirmDialog(null,
				"Total Price is "+frm.format(totalPrice)+"baht."+
				"\nDo you have a member card?");
		}while(memberCard==2);
		double totalPricewithdiscount;
		if (memberCard==0) {
			totalPricewithdiscount = totalPrice*90/100;
			JOptionPane.showMessageDialog(null, 
					"Amount to be paid is "+totalPricewithdiscount+"baht.");
		}
		else if (memberCard==1) {
			JOptionPane.showMessageDialog(null, 
					"Amount to be paid is "+totalPrice+"baht.");
		}
		
		
  }

}

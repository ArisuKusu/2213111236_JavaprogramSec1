import javax.swing.*;

public class example4 {

	public static void main(String[] args) {
		String productName = JOptionPane.showInputDialog("input product name: ");
		String productUnitstr = JOptionPane.showInputDialog("input product unit: ");
		int productUnit = Integer.parseInt(productUnitstr);
		
		float productPriceperUnit = Float.parseFloat(
				JOptionPane.showInputDialog("input price per unit: "));
		
		float totalPrice = productUnit*productPriceperUnit;
		float totalwithVat = totalPrice+(totalPrice*7/100);
		
		JOptionPane.showMessageDialog(null, 
				"Total Price is "+totalPrice+" baht."+
				"\nAdd VAT 7% is "+totalwithVat+" baht.");
				

	}

}

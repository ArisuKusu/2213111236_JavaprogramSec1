import java.util.*;

import javax.swing.JOptionPane;

public class Lab103 {
	public static void main(String[] args) {
		String smalldish = JOptionPane.showInputDialog("How many small dish: ");
		String bigdish = JOptionPane.showInputDialog("How many big dish: ");
		int smalls =Integer.parseInt(smalldish);
		int bigs =Integer.parseInt(bigdish);
		final int PRICESMALL = 30;
		final int PRICEBIG = 60;
		int sprice = PRICESMALL * smalls;
		int bprice = PRICEBIG * bigs;
		int all = sprice+bprice;
		JOptionPane.showMessageDialog(null,
				"You order "+ smalls +" small dish"+"("+sprice+")"+
				"\nYou order "+ bigs+" big dish"+"("+bprice+")"+ 
				"\n\nAmount to be paid is "+all+" baht.",
				"Noodles",
				JOptionPane.WARNING_MESSAGE);
	}
}

import java.util.*;
import javax.swing.JOptionPane;
import java.text.*;

public class lab105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String timepark = JOptionPane.showInputDialog("Input Time Praking (minute): ");
		int timeparking =Integer.parseInt(timepark);
		int timeparkhr = timeparking/60;
		int timemin = timeparking%60;
		float hrprice = 50*timeparkhr;
		float minprice = (float) (0.25*timemin);
		float price = hrprice+minprice;
		JOptionPane.showMessageDialog(null,
				"You parking "+timeparkhr+" Hour "+timemin+" Minute."
				+"\nAmount to be paid is "+ price+" baht.");
	}

}
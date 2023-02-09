import javax.swing.JOptionPane;

public class Shop100Baht {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product1 sold = new Product1();
		
		int button = JOptionPane.showComfirmDialog(null,"Pattanakarn?");
		if(button == 0) {
			sold = new PattanakarnBranch();
		}
		
		sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		
		JOptionPane.showMessageDialog(null, sold);

	}

}

import javax.swing.JOptionPane;
public class RectangleDemo1 {

	public static void main(String[] args) {
		double width = Double.parseDouble(JOptionPane.showInputDialog("input width: "));
		double lenght = Double.parseDouble(JOptionPane.showInputDialog("input lenght: "));
		String color = JOptionPane.showInputDialog("input color: ");
		
		Rectangle rec = new Rectangle(width,lenght,color);
		
		JOptionPane.showMessageDialog(null, rec
				+"\nArea of Rectangle ");

	}

}

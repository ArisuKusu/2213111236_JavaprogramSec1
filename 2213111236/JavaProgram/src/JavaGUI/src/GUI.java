import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame{
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	
	private JLabel lblLength,lblWidth,lblArea,lblPerimeter;
	
	public GUI() {
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lblLength = new JLabel("Enter the length");
		lblWidth = new JLabel("Enter the width");
		lblArea = new JLabel("Enter the area");
		lblPerimeter = new JLabel("Enter the perimeter");

		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		add(lblLength);
		add(lblWidth);
		add(lblArea);
		add(lblPerimeter);

		
	}
	
	
	
	public static void main(String[] args) {
		
	}

}

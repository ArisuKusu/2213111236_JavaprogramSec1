import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestGUI extends JFrame {
	private static final int WIDTH = 400;
	private static final int HIGHT = 300;
	private JLabel lblleghth,lblwidth,lblarea,lblparimeter;
	
	public TestGUI() {
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lblleghth = new JLabel("Enter the length:");
		lblwidth = new JLabel("Enter the width:");
		lblarea = new JLabel("Area:");
		lblparimeter = new JLabel("Perimeter:");
		
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		
		add(lblleghth);
		add(lblwidth);
		add(lblarea);
		add(lblparimeter);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGUI prog = new TestGUI();

	}

}

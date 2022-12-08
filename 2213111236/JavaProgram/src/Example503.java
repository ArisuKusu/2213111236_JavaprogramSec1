import javax.swing.*;

public class Example503 {
	static int inputYear;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input year"));
		boolean chkyear= checkYear(inputYear);
		while(inputYear < 1000 || inputYear > 3000) {
			inputYear = Integer.parseInt(JOptionPane.showInputDialog("Please Input year between 1000-3000"
					+ "\ninput year,again"));
		}
		if (isLeapYear(inputYear)) {
			JOptionPane.showMessageDialog(null, inputYear+" is Leap Year");
		}
		else {
			JOptionPane.showMessageDialog(null, inputYear+" is not Leap Year");
		}

	}
	public static boolean checkYear (int Year) {
		if(Year <= 1000 && Year >= 3000) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isLeapYear (int Year) {
		if (Year % 4 == 0 && (Year % 100 != 100 || Year % 400 == 0)) {
			return true;
		}
		else {
			return false;
		}
	}

}

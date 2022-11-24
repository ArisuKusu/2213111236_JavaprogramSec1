import javax.swing.*;
import java.text.*;

public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat  frm = new DecimalFormat("#.0");
		DecimalFormat  f1 = new DecimalFormat("#.##");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight: "));
		int height = Integer.parseInt(JOptionPane.showInputDialog("Input Height: "));
		
		double heightMeter= height/100.00;
		double BMI = weight/(heightMeter*heightMeter);
		String BMIMessage = "";
		if(BMI<18.5) {
			BMIMessage = "Underweight";
		}
		else if (BMI<24.9) {
			BMIMessage = "Normal-weight";
		}
		else if (BMI<29.9) {
			BMIMessage = "Overweight";
		}
		else if (BMI>=30.0) {
			BMIMessage = "Obesity";
		}
		
		JOptionPane.showMessageDialog(null, 
				"BMI = "+frm.format(BMI)+
				"\nYou're "+ BMIMessage,
				"BMI",
				JOptionPane.WARNING_MESSAGE);
		

	}

}

import javax.swing.*;

public class Lab605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		for(int i=0;i<num.length;i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+": "));
		}
		showEven(num);
		showOdd(num);

	}
	static void showEven(int[] nums) {
		int[] Num = nums;
		String evenMes = "";
		for (int i=0;i<Num.length;i++) {
			if(Num[i]%2==0) {
				evenMes = evenMes + Num[i] + " ";
			}
		}
			JOptionPane.showMessageDialog(null,"List of even number; \n"+evenMes,"Message",
					JOptionPane.INFORMATION_MESSAGE);

		}
	static void showOdd(int[] nums) {
		int[] Num = nums;
		String oddMes = "";
		for (int i=0;i<Num.length;i++) {
			if(Num[i]%2!=0) {
				oddMes = oddMes + Num[i] + " ";
			}
		}
			JOptionPane.showMessageDialog(null,"List of odd number; \n"+oddMes,"Message",
					JOptionPane.INFORMATION_MESSAGE);
	
   }

}

import javax.swing.*;

public class Example502 {
	static String Email;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputEmail();	

	}
	public static void InputEmail() {
		String ans = "";
		do {
		Email = JOptionPane.showInputDialog("input your e-mail:");
		checkEmailerror(Email);
		ans=JOptionPane.showInputDialog("Continue[y||Y to continue] : ");
		}while (ans.equalsIgnoreCase("y"));
	}
	public static void checkEmailerror(String chkEmail) {
		while (chkEmail.startsWith("@")||chkEmail.contains("")) {
			chkEmail =JOptionPane.showInputDialog("Input your e-mail:");	
		}
		chkEmail = chkEmail.toLowerCase();		
		if(chkEmail.endsWith("@gmail.com")||chkEmail.endsWith("@hotmail.com")) {
			JOptionPane.showMessageDialog(null, "Your e-mail is "+chkEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com ");
		}
	}

}

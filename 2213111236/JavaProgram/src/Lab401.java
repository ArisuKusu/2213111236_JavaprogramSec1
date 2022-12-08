import javax.swing.*;
import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Full Name: ");
		String Fullname = input.nextLine();
		if(Fullname.indexOf(' ')==-1) {
			System.out.println("Incorrect Name");
		}
		else {
			int space = Fullname.indexOf(" ");
			String Fristname = Fullname.substring(0,space).toUpperCase();
			String Lastname =  Fullname.substring(space,Fullname.length()).toLowerCase();
			System.out.println("Frist name: "+Fristname);
			System.out.println("last name:"+Lastname);
		}

	}

}

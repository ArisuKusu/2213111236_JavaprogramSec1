import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullname = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separted by a space.\n:");
		fullname = scan.nextLine();
		int space = fullname.indexOf(" ");
		String Firstname = fullname.substring(0,space);
		System.out.println(abbreviatName(fullname)+ "." + Firstname);
	}
	static String abbreviatName (String fullname) {
		String[] spacebar = fullname.split(" ");
		return spacebar[spacebar.length - 2 ].charAt(0) + "." + spacebar[spacebar.length - 1].charAt(0);
	}

}

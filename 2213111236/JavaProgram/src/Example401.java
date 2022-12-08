import java.util.*;

public class Example401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String InputText ="";
		String wordtoDisplay="";
		while(true) {
			System.out.print("Enter word");
			InputText = kb.next();
			if(InputText.equalsIgnoreCase("stop")) {
				break;
			  }
			wordtoDisplay = wordtoDisplay+InputText+" ";
			
		}
		System.out.println(wordtoDisplay.toUpperCase());
	}

}



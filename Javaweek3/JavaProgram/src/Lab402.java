import java.util.*;
import javax.swing.*;

public class Lab402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input some sentence :");
		String sentence = input.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point :");
			sentence = input.nextLine();
			if(sentence.endsWith(".")) {
				break;
			}
		}
		System.out.println();
		int Numofindex = 0;
		String formatsentence = sentence.replace(".", " ");
		for(int i = 0;i < sentence.length();i++) {
			if(formatsentence.charAt(i)== ' ') {
				System.out.println(formatsentence.substring(Numofindex,i));
				Numofindex=i+1;
			}
		}

	}

}

import java.util.*;
import javax.swing.*;

public class Example403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = input.nextLine();
		while(sentence.endsWith(".")) {
			System.out.print("Input a sentence, again: ");
			sentence = input.nextLine();	
		}
		System.out.println();
		int controlSpace = 0;
		for(int i = 0; i < sentence.length();i++) {
			if (sentence.charAt(i)==' ') {
				controlSpace++;
			}
		}
		System.out.println("This sentence has "+controlSpace+" spacebar.");
		System.out.println("This sentence has "+controlSpace+1+" word.");
	}

}

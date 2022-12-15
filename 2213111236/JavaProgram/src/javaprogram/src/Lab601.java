import java.util.*;

public class Lab601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int countofodd=0;
		int[] positiveNumber = new int[7];
		for (int i =0 ;i<positiveNumber.length;i++) {
			System.out.print("input number "+(i+1)+" : ");
			positiveNumber[i]=scan.nextInt();
			
			if (positiveNumber[i]%2!=0) {
				countofodd++;
			}
		}
		System.out.println();
		System.out.println("There are "+countofodd+" of odd number");
		for (int posNum : positiveNumber) {
			if(posNum%2!=0) {
				System.out.println("List of odd number :"+posNum+" ");
			}
		}

	}

}

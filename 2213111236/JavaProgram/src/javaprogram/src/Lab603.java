import java.util.Scanner;

public class Lab603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] numberOfinteger = {78, 36, 58, 41, 25, 92 ,75};
		System.out.print("Input index of array : ");
		int indexOfarray = scan.nextInt();
		
		while (indexOfarray < 0|| indexOfarray > (numberOfinteger.length-1)) {
			System.out.print("Input index of array, again : ");
			indexOfarray = scan.nextInt();
		}
		System.out.println();
		

	}

}

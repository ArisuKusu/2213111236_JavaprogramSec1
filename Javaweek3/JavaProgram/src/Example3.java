import java.util.*;

public class Example3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("input product name : ");
		String productName = scan.nextLine();
		System.out.print("input product unit : ");
		int productUnit = scan.nextInt();
		System.out.print("input price per unit : ");
		float pricePerUnits = scan.nextFloat();
		System.out.println();
		float totalPrice = productUnit*pricePerUnits;
		System.out.print("Total price is "+totalPrice+" baht.");
		float totalwithVat = totalPrice+(totalPrice*7/100);
		System.out.print("Add VAT 7% is "+totalwithVat+" baht.");
		
	}

}

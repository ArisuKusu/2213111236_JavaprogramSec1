import java.text.*;
import java.util.*;

public class Lab101 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		System.out.print("Input product name : ");
		String productName = scan.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = scan.nextInt();
		System.out.print("Input price per unit : ");
		float pricePerUnit= scan.nextFloat();
		System.out.println("--------------------------------------");
		float totalPrice = productUnit*pricePerUnit;
		System.out.println("Total Price is "+frm.format(totalPrice)+" baht.");
		System.out.println("--------------------------------------");
		System.out.print("How many discount (%) : ");
		int discount = scan.nextInt();
		System.out.println("--------------------------------------");
		float discountPrice = totalPrice*discount/100;
		System.out.println("discount from 15% \t"+frm.format(discountPrice)+" baht.");
		float amount = totalPrice-discountPrice;
		System.out.println("Amount to be paid \t"+frm.format(amount)+" baht.");

	}

}

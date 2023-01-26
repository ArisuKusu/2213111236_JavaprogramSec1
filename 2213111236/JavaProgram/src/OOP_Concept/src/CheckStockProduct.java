import java.text.NumberFormat;
import java.util.Scanner;

public class CheckStockProduct {
	static Scanner scan = new Scanner(System.in);
	static Product sr = new Product();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("How many product list in stock : ");
		int stock = scan.nextInt();
		Product[] pdl = new Product[stock];
		NumberFormat f1 = NumberFormat.getCurrencyInstance();
		for(Product pdls:pdl) {
			pdls= new Product();
			System.out.print("Input product Id   : ");
			pdls.setId(scan.next());
			System.out.print("Input product Unit : ");
			pdls.setUnit(scan.nextInt());
			while(pdls.getUnit()<=0 ) {
				System.out.print("Input product Unit, again  : ");
				pdls.setUnit(scan.nextInt());
			}
			System.out.println();
	   }
		System.out.println("-------------------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("-------------------------------------------------");
		for(Product pdls:pdl) {

       }
	}
}

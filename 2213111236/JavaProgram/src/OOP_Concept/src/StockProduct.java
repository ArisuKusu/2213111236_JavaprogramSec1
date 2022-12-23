import java.text.NumberFormat;
import java.util.*;

public class StockProduct {
	static Scanner scan = new Scanner(System.in);
	static Product sr = new Product();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] pdl = new Product[4];
		NumberFormat f1 = NumberFormat.getCurrencyInstance();
		for(int i = 0; i<pdl.length;i++) {
			pdl[i]= new Product();
			System.out.print("Input product Id    : ");
			pdl[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			pdl[i].setUnit(scan.nextInt());
			while(pdl[i].getUnit()<=0 ) {
				System.out.print("Input product Unit, again  : ");
				pdl[i].setUnit(scan.nextInt());
			}
			System.out.print("Input product Price : ");
			pdl[i].setPrice(scan.nextDouble());
			System.out.println();
			while(pdl[i].getPrice()<=0) {
				System.out.print("Input product Price, again : ");
				pdl[i].setPrice(scan.nextDouble());
				System.out.println();
			}
		}
		System.out.println("-------------------------------------------------");
		double sum = 0;
		for(int i = 0; i<pdl.length;i++) {
			System.out.println("Product ID : "+pdl[i].getID()+", Total price = "+pdl[i].calculate()+" baht.");
			sum += pdl[i].calculate();
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Total price of all products is "+f1.format(sum));

	}

}

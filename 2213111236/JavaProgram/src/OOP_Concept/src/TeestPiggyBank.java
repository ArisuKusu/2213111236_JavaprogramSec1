import java.util.*;

public class TeestPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*pb.setPiggyBank(500);
		System.out.println("Money total: "+pb.getTotal());
		pb.addOne(300);
		System.out.println("Add 1 Baht Money : "+300);
		System.out.println("Money Total: "+pb.getTotal());
		pb.addTwo(100);
		System.out.println("Add 2 Baht Money : "+100);
		System.out.println("Money Total: "+pb.getTotal());
		pb.addTen(10);
		System.out.println("Add 10 Baht Money : "+10);
		System.out.println("Money Total: "+pb.getTotal()); */
		inputSizeofPiggyBank();

	}
	public static void inputSizeofPiggyBank() {
		System.out.println("Money total: "+pb.getTotal());
		System.out.println("please difine size of PiggyBank:");
		//int size = scan.nextInt();
		//pb.setPiggyBank(size);
		pb.setPiggyBank(scan.nextInt());
		System.out.print("size of your PiggyBank: "+pb.getPiggyBank());
		inputCoin();
	}
	public static void inputCoin() {
		System.out.println("\n====================");
		System.out.println("Menu of PiggyBank");
		System.out.println("\n====================");
		System.out.println("[1] 1 Baht.");
		System.out.println("[2] 2 Baht.");
		System.out.println("[3] 5 Baht.");
		System.out.println("[4] 10 Baht.");
		System.out.println("[5] Exit");
		System.out.println("====================");
		System.out.println("Please select choice [1-5]: ");
		int choice = scan.nextInt();
		if(choice==1) {
			System.out.println("Insert 1 baht money:");
			pb.addOne(scan.nextInt());
			System.out.print("Money total: "+pb.getTotal());
		}else if (choice==2) {
			System.out.println("Insert 2 baht money:");
			pb.addTwo(scan.nextInt());
			System.out.print("Money total: "+pb.getTotal());
	   }else if (choice==3) {
			System.out.print("Insert 5 baht money:");
			pb.addTwo(scan.nextInt());
			System.out.print("Money total: "+pb.getTotal());
	   }else if (choice==4) {
			System.out.print("Insert 10 baht money:");
			pb.addTwo(scan.nextInt());
			System.out.print("Money total: "+pb.getTotal());
	   }else if (choice==5) {
		   System.out.println("Bye Bye");
	   }

    }
}

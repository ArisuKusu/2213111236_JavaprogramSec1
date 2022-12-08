import java.util.*;
public class lab403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		System.out.print("Message : ");
		String Mes = sr.nextLine();
		String LoMes = Mes.toLowerCase();
		if(LoMes.indexOf("nichi")>=0) {
			System.out.println("Nichi is a sentence");
		}                                    
		else{
			System.out.println(Mes);
			}

	}

}

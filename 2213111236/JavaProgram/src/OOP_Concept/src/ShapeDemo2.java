import java.util.Scanner;
public class ShapeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Cylinder[] cylinder = new Cylinder[5];
		for(int i = 0;i<cylinder.length;i++) {
			System.out.print("");
			double radius = scan.nextDouble();
			System.out.print("");
			double height = scan.nextDouble();
			cylinder[i] = new Cylinder(radius,height);
			
		}
		int a = 1;
		for(Cylinder i : cylinder) {
			System.out.print("Cylinder "+a+", Vlume="+i.getVolume());
			a++;
		}

	}

}

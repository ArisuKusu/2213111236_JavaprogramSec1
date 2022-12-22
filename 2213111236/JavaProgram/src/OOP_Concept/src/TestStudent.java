import java.util.*;

public abstract class TestStudent {
	static 	Scanner scan = new Scanner(System.in);
	static Student sr = new Student();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("How many student in classroom: ");
		int student = scan.nextInt();
		System.out.println();
		Student[] std = new Student[student];
		for(int i = 0;i<std.length;i++) {
			std[i]= new Student();
			System.out.println("INPUT INFORMATION OF STUDENT "+(i+1));
			System.out.println("-------------------------------------------");
			System.out.print("Input student name: ");
			std[i].setName(scan.next());
			System.out.print("Input student score: ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input student score, again: ");
				std[i].setScore(scan.nextInt());
			}
			System.out.println();
		}
		/* System.out.println();
		System.out.println("LIST PF PASS STUDENT (>=50)");
		System.out.println("---------------------------------------------");
		for(int i = 0;i<std.length;i++) {
			if(std[i].isPass()) {
				System.out.println(">> "+std[i].getName()+" "+
				" ("+std[i].getScore()+" )"); 
			}
		} */
		for(Student stds:std) {
			if(stds.isPass())
				System.out.println(">> "+stds.getName()+
				" get grade "+stds.findGrade()); 
		}
	}

}

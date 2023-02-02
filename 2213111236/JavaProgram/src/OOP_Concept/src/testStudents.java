
public class testStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students phakin = new Students("Phakin Skywalker","1 Happy eve");
		System.out.println(phakin);
		
		phakin.setAddress("10 Pattanakarn");
		System.out.println(phakin);
		System.out.println(phakin.getName());
		System.out.println(phakin.getAddress());
		
		phakin.addCourseGrade("INT107",87);
		phakin.addCourseGrade("INT108",5);
		phakin.addCourseGrade("MSC-202",0);
		phakin.printGrades();
		
		System.out.printf("\nThe average grade is %.2%fn",phakin.getAvergeGrade());
	}

}


public class PersonalInfo {
	private Person name;
	private Date bDay;
	private int personID;
	
	public PersonalInfo() {
		name = new Person();
		bDay = new Date();
		personID = 0;
	}
	public  PersonalInfo(String first,String last, int mount , int day, int year,int ID) {
		name = new Person(first,last);
		
		bDay = new Date (mount,day,year);
		
		personID = ID;
	}
	public void setpersonalInfo(String first,String last,int mount , int day, int year,int ID) {
		name = setname(first,last);
		bDay.setDate(mount,day,year);
		personID=ID;
	}
	public String toString() {
		return "Name: " +name.toString()+"\n"
				+"Date of birth: "+ bDay.toString()
				+"\n"+"Personal ID: "+personID;
	}
}

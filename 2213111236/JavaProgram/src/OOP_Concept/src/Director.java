
public class Director {
	private String name;
	private String email;
	private char gender;
	
	public Director(String name, String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Director(String name, String email) {
		this.name = null;
		this.email = null;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
		if (gender == 'M' || gender == 'm')
			return "Male";
		else if (gender == 'F' || gender == 'f')
			return "Female";
		else 
			return null;
	}
	public String toString() {
		return name + " (" + eMail + ";" + getGenderName() + ")";
	}

}

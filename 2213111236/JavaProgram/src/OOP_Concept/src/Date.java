
public class Date {
	private int dMount;
	private int dDay;
	private int dYear;
	
	public Date () {
		dMount = 1;
		dDay = 1;
		dYear = 1000;
	}
	public Date(int mount,int day,int year) {
		dMount = mount;
		dDay = day;
		dYear = year;
	}
	public void setDate(int mount,int day,int year) {
		dMount = mount;
		dDay = day;
		dYear = year;
	}
	public int getMount() {
		return dMount;
	}
	public int getDay() {
		return dDay;
	}
	public int getYear() {
		return dYear;
	}
	public String toString() {
		return getMount()+"-"+getDay()+"-"+getYear();
	}

}

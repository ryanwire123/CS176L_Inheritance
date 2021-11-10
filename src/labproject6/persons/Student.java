package labproject6.persons;

public class Student extends Person {
	private int year;
	public static final int FRESHMAN = 1;
	public static final int SOPHMORE = 2;
	public static final int JUNIOR = 3;
	public static final int SENIOR = 4;
	public static final int SUPERSENIOR = 5;
	
	public Student() {
	}

	public Student(String name, int year) {
		super(name);
		this.year = year;
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public String toString() {
		String s = super.toString();
		return s + "\n " + "Year: " +this.year + "||";
	}

}

package labproject6.persons;

public class Staff extends Employee {
	private String title;
	public Staff() {
	}

	public Staff(String name, 
			String officeNumber, 
			double salary, 
			String title
			) {
		super(name, officeNumber, salary);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String toString() {
		String s = super.toString();
		return s + "\n " + "Title: "+this.title + "||";
	}
	
	

}

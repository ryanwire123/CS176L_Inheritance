package labproject6.persons;

public class Faculty extends Employee {
	private String rank;
	
	public Faculty() {
	}

	public Faculty(String name, 
			String officeNumber, 
			double salary, 
			String rank
			) {
		super(name, officeNumber, salary);
		this.rank = rank;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	public String toString() {
		String s = super.toString();
		return s + "\n " +"Rank: " + this.rank + "||";
	}
	
	

}

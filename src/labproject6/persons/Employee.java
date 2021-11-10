package labproject6.persons;

public class Employee extends Person {
	private String officeNumber;
	private double salary;
	public Employee() {
	}
	
	public Employee(String name, String officeNumber, double salary) {
		super(name);
		this.officeNumber = officeNumber;
		this.salary = salary;
	}
	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		String s = super.toString();
		return s + "\n " + "Office Number: " +this.officeNumber + "\n " +"Salary: "+ salary + "||";
	}

}

package labproject6.persons;

public class Person {
	private String name;
	public Person() {
	}
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.getClass() + "\n" +"Name: " + name;
	}

}
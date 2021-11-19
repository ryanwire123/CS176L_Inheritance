package labproject7.writtenworks;

public class TestWrittenWorks {

	public static void main(String[] args) {
		Novel a1 = new Novel("Plagueis", "James Luceno", 2010, "fiction", 20);
		ShortStory s1 = new ShortStory("Hobbit", "JRR Tolkien", 1938, "fiction", 5, true);
		System.out.println(a1.toString());
		System.out.println(s1.toString());

	}

}

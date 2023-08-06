package oopsPractice;

class Computer {
	private static int id; // All of the object using same static variable
	private static int counter = 0;

	public Computer() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}

}

public class codeSnippet4 {

	public static void main(String[] args) {

		Computer c1 = new Computer();
		Computer c2 = new Computer();
		Computer c3 = new Computer();

		System.out.println(c1.getId() + " " + c2.getId() + " " + c3.getId());
	}

}

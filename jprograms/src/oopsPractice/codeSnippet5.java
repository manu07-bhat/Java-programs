package oopsPractice;

class Person {
	private String name;
	private static int age;
	static {
//		name = "john";	// cant access static -> Instance varibale
	}

	Person() {
		age = 20;
	}

	public int getAge() {
		return age;
	}
}

public class codeSnippet5 {

	public static void main(String[] args) {
		System.out.println(new Person().getAge()); // Anonymous Object
		// no name only used once
	}

}

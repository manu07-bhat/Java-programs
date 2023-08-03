package j.programsonOops;

class Cal {
	int add(int a, int b) {
		return a + b;
	}

	double add(int a, double b) {
		return a + b;
	}

}

public class AmbiguityErr {

	public static void main(String[] args) {
		Cal obj = new Cal();
		// Method overloading with type casting | type promotion | implicit casting
		System.out.println(obj.add(5, 5.5f));
	}

}

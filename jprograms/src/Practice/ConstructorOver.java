package Practice;

class parent {
	public parent() {
		System.out.println("Parent");
	}
}

public class ConstructorOver extends parent {

	ConstructorOver() {
		super();
		System.out.println("Default constructor");
		String str = "1212";
		int num = Integer.parseInt(str);
		System.out.println(num);

		int s = 111;
		String s1 = Integer.toString(s);
		System.out.println(s1);
	}

	ConstructorOver(int a) {
		this();
		System.out.println("Parameterize");
	}

	public static void main(String[] args) {
		ConstructorOver ob = new ConstructorOver();
	}

}

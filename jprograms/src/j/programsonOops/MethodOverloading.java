package j.programsonOops;

public class MethodOverloading {

	static void add(int a, int b) {
		System.out.println(a + b);
	}

	static int add(int a, float c) // overloading
	{
		System.out.println(a + c);
		return a;
	}

	static void add(float c, int a) {
		System.out.println(a - c);
	}

	public static void main(String[] args) {
		add(5.0f, 1);
		add(1, 1);
		add(1, 5.0f);
	}

}

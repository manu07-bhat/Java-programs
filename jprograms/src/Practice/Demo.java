package Practice;

public class Demo {

	void method1() {
		System.out.println("Method 1");
	}

	void method1(int a) {
		System.out.println("Parameterize Method " + a);
	}

	void method1(int a, float b) {
		System.out.println(a + b);
	}

	void method1(float a, int b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.method1(50f, 10);
	}

}

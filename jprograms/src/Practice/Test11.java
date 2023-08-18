package Practice;

public class Test11 {

	public Test11(int a) {

		System.out.println("C " + a);
	}

	public Test11() {
		System.out.println("C");
	}

	public Test11(float a) {

		System.out.println("C " + a);
	}

	void fun1() {
		System.out.println("fun1");
	}

	void fun1(int a) {
		System.out.println("fun2 " + a);
	}

	void fun1(int a, float b) {
		System.out.println("fun3 " + a + " " + b);
	}

	void fun1(float a, int b) {
		System.out.println("fun4 " + a + " " + b);
	}

	public static void main(String[] args) {
		Test11 obj = new Test11(1);
//		obj.fun1();
		obj.fun1(1,1f);
	}

}

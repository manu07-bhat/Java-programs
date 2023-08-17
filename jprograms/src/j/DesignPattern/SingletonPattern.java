package j.DesignPattern;

class Test {
	private static Test t;

	private Test() {

	}

	void fun() {
		System.out.println("inside Test.fun");
	}

	public static Test getInstance() {
		if (t == null) {
			t = new Test();
			return t;
		} else {
			return t;
		}
	}
}

public class SingletonPattern {

	public static void main(String[] args) {
		Test t1 = Test.getInstance();
		t1.fun();
		Test t2 = Test.getInstance();
		t2.fun();

		System.out.println(t1 == t2);
	}

}

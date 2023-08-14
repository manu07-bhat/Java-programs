package Practice;

class Parent {

//	int a = 10;

	void method2() {
		System.out.println("Method 1");
	}
}

class Child extends Parent {

	void method2() {
		super.method2();
		System.out.println("method 2");
	}
}

public class Demo2 {

	public static void main(String[] args) {

		Parent d = new Child();
		d.method2();
	}

}

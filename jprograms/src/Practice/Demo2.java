package Practice;

class Parent11 {

//	int a = 10;

	void method2() {
		System.out.println("Method 1");
	}
}

class Child extends Parent11 {

	void method2() {
		super.method2();
		System.out.println("method 2");
	}
}

public class Demo2 {

	public static void main(String[] args) {

		Parent11 d = new Child();
		d.method2();
	}

}

package Practice1;

class Parent {
	private int a = 10;
	int b = 20;

	public void geters(int a) {
		this.a = a;
		System.out.println(a);
	}
}

class Child1 extends Parent {

	Child1() {
		super();
	}

	public void geters(int a) {

		super.geters(a);
		a = 30;
		System.out.println(a);
	}

	int c = super.b;
	int d = this.b;

	void test() {
		System.out.println(c);
		System.out.println(d);
	}

}

public class ThisSuperKeyword {

	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.geters(10);
	}

}

package oopsPractice;

class Test6 {
	int x, y;

	Test6() {
		x = 100;
		y = 200;
	}

	Test6(int x, int y) {
		this.x = x;
		this.y = y;

	}
}

class Test5 extends Test6 {
	int a, b;

	Test5() {
		a = 300;
		b = 400;
	}

	Test5(int a, int b) {

		super(a, b);
		this.a = a;
		this.b = b;
	}

	void disp() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);

	}
}

public class codeSnippetInheritance3 {

	public static void main(String[] args) {
		Test5 t2 = new Test5(9, 99);
		t2.disp();
	}

}

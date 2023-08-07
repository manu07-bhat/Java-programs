package oopsPractice;

class Test7 {
	int x, y;

	Test7() {
		x = 100;
		y = 200;
	}

	Test7(int x, int y) {
		this.x = x;
		this.y = y;

	}
}

class Test8 extends Test7 {
	int a, b;

	Test8() {
		this(9, 99);
		a = 300;
		b = 400;
	}

	Test8(int a, int b) {

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

public class codeSnippetInheritance4 {

	public static void main(String[] args) {
		Test8 t2 = new Test8(); // 9,99
		t2.disp();
	}

}

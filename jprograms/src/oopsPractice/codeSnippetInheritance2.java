package oopsPractice;

class Test3 {
	int x, y;

	Test3() {
		x = 100;
		y = 200;
	}

	Test3(int x, int y) {
		this.x = x;
		this.y = y;

	}
}

class Test4 extends Test3 {
	int a, b;

	Test4() {
		a = 300;
		b = 400;
	}

	Test4(int a, int b) {
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

public class codeSnippetInheritance2 {

	public static void main(String[] args) {
		Test4 t2 = new Test4(9, 99);
		t2.disp();
	}

}

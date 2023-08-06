package j.programsonOops;

class d1 {
	int a = 100;

	void fun1() {
		System.out.println("Java");
	}
}

class d2 extends d1 {
	int b = 200;

	void fun2() {
		System.out.println("Python");
	}
}

class d3 extends d2 {
	int c = 300;

	void fun3() {
		System.out.println("Javascript ");
	}

	void dis() {
		System.out.println(a + " " + b + " " + c);
	}
}

public class MultiLvlInheritance2 {

	public static void main(String[] args) {
		d3 in = new d3();
		in.dis();
		in.fun1();
		in.fun2();
		in.fun3();
	}

}

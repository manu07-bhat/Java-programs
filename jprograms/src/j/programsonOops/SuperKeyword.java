package j.programsonOops;

class Parent1 {
	private static int i = 99;
}

public class SuperKeyword extends Parent1 {
	int i = 9;

	void print() {
		System.out.println(i); // child i
//		System.out.println(super.i); // Parent i
	}

	public static void main(String[] args) {
		SuperKeyword o = new SuperKeyword();
		o.print();
	}

}

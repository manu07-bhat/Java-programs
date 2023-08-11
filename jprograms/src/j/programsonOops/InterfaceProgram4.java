package j.programsonOops;

import java.util.Scanner;

interface Calci {
	void add();

	void sub();

	default void mul() {
		System.out.println("mul");
	}

	static void div() {
		System.out.println("DIV	");
		reg();
	}

	private static void reg() {
		System.out.println("Sec code");
	}

}

class Developer1 implements Calci {

	public void add() {
		int x = 10;
		int y = 20;
		System.out.println(x + y);
	}

	public void sub() {
		int x = 10;
		int y = 20;
		System.out.println(x - y);
	}

	public void div() {
		System.out.println("DIV	");
	}
}

class Developer2 implements Calci {
	Scanner scan = new Scanner(System.in);

	public void add() {
		System.out.println("Enter the value of x and  y ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println(x + y);
	}

	public void sub() {
		System.out.println("Enter the value of x and  y ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println(x - y);
	}
}

class Permit {

	void access(Calci ref) {
		ref.add();
		ref.sub();
		ref.mul();
		Calci.div();

	}
}

public class InterfaceProgram4 {

	public static void main(String[] args) {
		Calci d1 = new Developer1();
		Calci d2 = new Developer2();

		Permit p = new Permit();

		p.access(d2);
	}

}

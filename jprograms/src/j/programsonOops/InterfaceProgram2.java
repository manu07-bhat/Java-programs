package j.programsonOops;

import java.util.Scanner;

interface Calculator1 {

	void add();

	void sub();
}

abstract class MyCal1 implements Calculator1 {

	public void add() {
		System.out.println("Add");
	}

	void mul() {
		int x = 2;
		int y = 3;
		System.out.println(x * y);
	}
}

class MyCal21 implements Calculator1 {
	Scanner scan = new Scanner(System.in);

	public void add() {

		System.out.println("Enter the 2 number to add");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println(x + y);
	}

	public void sub() {
		System.out.println("Enter the 2 number to sub");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println(x - y);
	}
}

class Work1 {

	void reference(Calculator1 ref) {
		ref.add();
		ref.sub();
	}
}

public class InterfaceProgram2 {

	public static void main(String[] args) {
		MyCal21 k = new MyCal21();

		Work1 w = new Work1();
		w.reference(k);
	}

}

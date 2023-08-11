package j.programsonOops;

import java.util.Scanner;

interface Calculator {

	void add();

	void sub();
}

class MyCal implements Calculator {

	public void add() {
		int x = 100;
		int y = 200;
		System.out.println(x + y);
	}

	public void sub() {
		int x = 100;
		int y = 200;
		System.out.println(x - y);
	}
}

class MyCal2 implements Calculator {
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

class Work {

	void reference(Calculator ref) {
		ref.add();
		ref.sub();
	}
}

public class InterfaceProgram {

	public static void main(String[] args) {

		MyCal m1 = new MyCal();
		MyCal2 m2 = new MyCal2();

		Work w = new Work();
		w.reference(m2);
//		Work.reference(m1);  //if method is static 

	}

}

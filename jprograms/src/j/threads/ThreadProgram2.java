package j.threads;

import java.util.Scanner;

class Test11 extends Thread {

	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if (name.equalsIgnoreCase("add")) {
			add();
		} else if (name.equalsIgnoreCase("char")) {
			printChar();
		} else {
			printNum();

		}
	}

	public void add() {
		System.out.println("Addition started ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = scan.nextInt();
		System.out.println("Enter the Second number: ");
		int b = scan.nextInt();

		int c = a + b;
		System.out.println(c);
		System.out.println("Addition is ended");
	}

	public void printChar() {
		System.out.println("Printing char started");
		for (int i = 65; i <= 75; i++) {
			System.out.println("  " + (char) i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Printing char ended");

	}

	public void printNum() {
		System.out.println("Printing number started");

		for (int i = 10; i <= 20; i++) {
			System.out.println("    " + i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing number ended");
		}

	}
}

public class ThreadProgram2 {

	public static void main(String[] args) {
		Test11 t1 = new Test11();
		Test11 t2 = new Test11();
		Test11 t3 = new Test11();

		t1.setName("add");
		t2.setName("char");
		t3.setName("num");

		t1.start();
		t2.start();
		t3.start();

	}

}

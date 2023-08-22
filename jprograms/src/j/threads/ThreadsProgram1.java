package j.threads;

import java.util.Scanner;

public class ThreadsProgram1 {

	static void add() {
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

	static void printChar() throws Exception {
		System.out.println("Printing char started");
		for (int i = 65; i <= 75; i++) {
			System.out.println((char) i);
			Thread.sleep(4000);
		}

		System.out.println("Printing char ended");

	}

	static void printNum() throws Exception {
		System.out.println("Printing number started");

		for (int i = 10; i <= 20; i++) {
			System.out.println(i);
			Thread.sleep(4000);
		}
		System.out.println("Printing number ended");
	}

	public static void main(String[] args) throws Exception {
		add();
		printChar();
		printNum();

	}

}

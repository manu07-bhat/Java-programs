package j.ExceptionHandling;

import java.util.Scanner;

public class ExceptionProgram4 {

	static void fun1() throws Exception {
		System.out.println("Connection 41 estd ");
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter the numerator");
			int a = scan.nextInt();

			System.out.println("Enter the denominator");
			int b = scan.nextInt();
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Inside fun1() ");
			throw e; // Re -Throwing Exception
		}

		finally {
			System.out.println("Connection 41 treminated");
		}
	}

	public static void main(String[] args) {
		try {
			fun1();
		} catch (Exception e) {
			System.out.println("Inside Main");
		}
	}

}

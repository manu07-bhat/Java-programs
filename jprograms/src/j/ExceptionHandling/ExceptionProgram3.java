package j.ExceptionHandling;

import java.util.Scanner;

class Demo11 {
	void fun1()  {
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

}

public class ExceptionProgram3 {

	public static void main(String[] args) {
		Demo11 obj = new Demo11();
		try {
			obj.fun1();
		} catch (Exception e) {
			System.out.println("Inside main method");
		}
	}

}

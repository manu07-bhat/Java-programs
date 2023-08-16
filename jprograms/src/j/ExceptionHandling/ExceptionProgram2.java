package j.ExceptionHandling;

import java.util.Scanner;

class Demo1 {
	static void fun1() {
		System.out.println("Connection 4 estd ");
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the numerator");
		int a = scan.nextInt();

		System.out.println("Enter the denominator");
		int b = scan.nextInt();
		int c = a / b;
		System.out.println(c);

		System.out.println("Connection 4 treminated");
	}

}

class Demo2 {
	static void fun2() {
		System.out.println("Connection 3 estd ");
		try {
			Demo1.fun1();
		} catch (Exception e) {

			System.out.println("Exception handeled in fun2()");
		}

		System.out.println("Connection 3 treminated");
	}
}

class Demo3 {

	void fun3() {
		System.out.println("Connection 2 estd ");
		Demo2.fun2();
		System.out.println("Connection 2 Terminated");
	}

}

public class ExceptionProgram2 {

	public static void main(String[] args) {
		System.out.println("Connection 1 estd");
		Demo3 d3 = new Demo3();
		d3.fun3();
		System.out.println("Connection 1 is terminated");

	}

}

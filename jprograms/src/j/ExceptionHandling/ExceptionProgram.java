package j.ExceptionHandling;

import java.util.Scanner;

public class ExceptionProgram {

	public static void main(String[] args) {

		System.out.println("Connection is Estd");
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter the numerator");
			int a = scan.nextInt();
			System.out.println("Enter the denominator");
			int b = scan.nextInt();
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(" non zero denominator | or non floating value");
		}

		System.out.println("Connection is terminated");

	}

}

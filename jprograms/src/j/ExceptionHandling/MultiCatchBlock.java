package j.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchBlock {

	public static void main(String[] args) {
		System.out.println("Connection estd");
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter the numerator");
			int a = scan.nextInt();
			System.out.println("Enter the denominator");
			int b = scan.nextInt();
			int c = a / b;

			System.out.println(c);

			System.out.println("enter the size of array");
			int size = scan.nextInt();

			int[] arr = new int[size];
			System.out.println("Enter the element");
			int ele = scan.nextInt();
			arr = null;
			System.out.println("enter the position to be stored");
			int index = scan.nextInt();

			arr[index] = ele;

			System.out.println(arr[index]);
		} catch (ArithmeticException ae) {
			System.out.println("Provide non - zero value ");
		} catch (InputMismatchException ie) {
			System.out.println("Provide Interger value ");
		} catch (ArrayIndexOutOfBoundsException ao) {
			System.out.println(" Enter the array within the limit ");
		} catch (Exception e) {
			System.out.println("Invalid input " + e);
		}

		System.out.println("Connection is treminated ");
	}

}

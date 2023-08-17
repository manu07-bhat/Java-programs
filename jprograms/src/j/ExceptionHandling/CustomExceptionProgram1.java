package j.ExceptionHandling;

import java.util.Scanner;

class UnderageException extends Exception {

	public String getMessage() {
		return "You are too youg  Have patient";
	}
}

class OverageException extends Exception {

	public String getMessage() {
		return "You are too old  ";
	}
}

class Applicant {

	private int minage = 18;
	private int age;

	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age : ");
		age = scan.nextInt();
	}

	void checkAge() throws UnderageException, OverageException {
		if (minage <= age && age < 60) {
			System.out.println("Collection your License");
		} else if (age < minage) {
			UnderageException ua = new UnderageException();
			System.out.println(ua.getMessage());
			throw ua;

		} else {
			OverageException oa = new OverageException();
			System.out.println(oa.getMessage());
			throw oa;
		}
	}
}

class Rto {

	void initiate() {
		Applicant ap = new Applicant();
		for (;;) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Do you want to Apply : Yes/No");
			String s = scan.next();
			if (s.equals("yes")) {
				try {
					ap.input();
					ap.checkAge();
				} catch (Exception e) {

				}
			} else {
				System.out.println("Thank you Visit Again");
				System.exit(0);
			}
		}
	}

}

public class CustomExceptionProgram1 {

	public static void main(String[] args) {
		Rto r = new Rto();
		r.initiate();

	}
}

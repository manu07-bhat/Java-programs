package j.ExceptionHandling;

import java.util.Scanner;

class InvalidUserException extends Exception {

	public String getMessage() {

		return "Invalid pin. Try again";
	}
}

class Atm {
	private int pin = 8888;
	private int p;

	void acceptPin() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the pin : ");
		p = scan.nextInt();

	}

	void validPin() throws InvalidUserException {
		if (pin == p) {
			System.out.println("Login Sucessfull");

		} else {
			InvalidUserException iu = new InvalidUserException();
			System.out.println(iu.getMessage());
			throw iu;
		}
	}
}

class Bank {

	void initiate() {
		Atm atm = new Atm();
		try {
			atm.acceptPin();
			atm.validPin();
		} catch (Exception e) {
			try {
				atm.acceptPin();
				atm.validPin();
			} catch (Exception e2) {
				try {
					atm.acceptPin();
					atm.validPin();
				} catch (Exception e3) {
					System.out.println("3 Attempt Finished  Card Blocked");
					System.exit(0);
				}
			}
		}
	}
}

public class CustomException {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.initiate();
	}

}

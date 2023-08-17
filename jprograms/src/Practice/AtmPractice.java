package Practice;

import java.util.Scanner;

class UserDefineExp extends Exception {

	public String getMessage() {
		return "Invalid Input. Try again";
	}
}

class Atm {

	private int pin = 8888;
	private int p;

	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the pin to Login");
		p = scan.nextInt();
	}

	void validate() throws UserDefineExp  {
		if (pin == p) {
			System.out.println("Login Sucessful");
		} else {
			UserDefineExp exp = new UserDefineExp();
			System.out.println(exp.getMessage());
			throw exp;
		}
	}
}

public class AtmPractice {

	public static void main(String[] args) {
		Atm m = new Atm();
		try {
			m.input();
			m.validate();

		} catch (UserDefineExp e) {

			try {
				m.input();
				m.validate();
			} catch (UserDefineExp e1) {

				try {
					m.input();
					m.validate();
				} catch (UserDefineExp e2) {

					System.out.println("Card Blocked Please Contact the bank");
				}
			}
		}
	}

}

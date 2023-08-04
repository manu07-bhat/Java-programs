package j.programsonOops;

import java.util.Scanner;

class Yesbank {

	private int bal, status;

	void setadd(int add) {
		if (add >= 0) {
			this.bal = bal + add;
			this.status = this.bal;
			System.out.println("Balance : " + this.bal);
		} else {
			System.out.println("Pls enter positive value");
		}
	}

	void setwithdraw(int withdraw) {

		if (withdraw >= 0 && this.bal >= withdraw) {
			this.bal = this.bal - withdraw;
			this.status = this.bal;
			System.out.println(bal);
		} else {
			System.out.println("No Sufficient Balance");
		}
	}

	int getdisplay() {
		return bal;
	}

	static void operator() {
		Scanner scan = new Scanner(System.in);
		Yesbank obj = new Yesbank();

		boolean opt = true;
		while (opt) {

			System.out.println("Select the option :");
			System.out.println("1.Status\n2.AddMoney\n3.Withdraw\n4.Balance\n5.Exit ");
			int var = scan.nextInt();
			if (var == 1) {
				System.out.println(obj.status);
			} else if (var == 2) {
				System.out.println("Enter the amt to add : ");
				int add = scan.nextInt();
				obj.setadd(add);
			} else if (var == 3) {
				System.out.println("Enter the amt to Withdraw : ");
				int withdraw = scan.nextInt();
				obj.setwithdraw(withdraw);

			} else if (var == 4) {
				System.out.println("BALANCE : " + obj.getdisplay());
			} else if (var == 5) {
				System.out.println("Thankyou");
				System.exit(0);
			} else {
				System.out.println("Invalid Option");
			}

			System.out.println("Do you want to continue : Y/N");
			String s = scan.next();
			if (s.equals("y")) {
				opt = true;
			} else {
				System.out.println("Thankyou U got exited");
				opt = false;

			}

		}
		scan.close();
	}

}

public class AtmMachine {

	public static void main(String[] args) {
		Yesbank.operator();
	}

}

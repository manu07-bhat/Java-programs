package j.programsonOops;

class Bank {
	private long balance;
	private int count;

	public void setData(long amt, int c) {
		if (amt >= 0 && c >= 0) {

			count = c;
			balance = amt;
		} else {
			System.out.println("Invalid amt");
			System.exit(0);

		}
	}

	public long getData() {
		return balance + count;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		Bank b = new Bank();
//	b.balance =100_000;
//	Bank.count=1;
//	System.out.println(b.balance+Bank.count);

		b.setData(-100_000, 1);
		System.out.println(b.getData());

	}

}

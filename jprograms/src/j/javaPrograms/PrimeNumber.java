package j.javaPrograms;

public class PrimeNumber {

	static void prime() {
		int a = 2;
		int flag = 0;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				flag++;
			}
		}
		if (flag == 2) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a prime number");
		}

	}

	public static void main(String[] args) {
		prime();
	}

}

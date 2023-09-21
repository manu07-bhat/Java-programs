package Practice;

public class Test1 {

	static void Prime() {
		int s = 21;
		int flag = 0;

		for (int i = 1; i <= s; i++) {

			if (s % i == 0) {
				flag++;
			}
		}

		if (flag == 2) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a Prime num");
		}
	}

	static void PrimeList() {
		int val = 20;

		for (int i = 1; i <= val; i++) {
			int flag = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					flag++;
				}
			}
			if (flag == 2) {
				System.out.println(i);
			}
		}
	}

	static void Palandrome() {
		String s = "kanasdfanak";
		int i = 0, j = s.length() - 1;
		
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j)) {
				System.out.println("Not a Palandrome");
				System.exit(0);
			} else {
				i++;
				j--;

			}
		}
		System.out.println("Palandrome");

	}

	public static void main(String[] args) {
//		Prime();
//		PrimeList();
		Palandrome();
	}

}

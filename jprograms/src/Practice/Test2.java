package Practice;

import java.util.Arrays;

public class Test2 {

	static void max() {
		int a[] = { 10, 23, 50, 3, 1, 22, 0 };

		int count = 0;

		for (int i = 0; i < a.length; i++) {

			if (count < a[i]) {
				count = a[i];
			}
		}
		System.out.println(count);
	}

	static void swap() {
		int x = 10;
		int y = 20;

		System.out.println("Before swap " + x + " " + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After swap " + x + " " + y);
	}

	static void vowel() {
		String s = "Kana";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'A' || c == 'a' || c == 'e' || c == 'E' || c == 'I' || c == 'i' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				System.out.print(c);
			}
		}

	}

	static void printPrime() {
		int till = 20;

		for (int i = 1; i <= till; i++) {
			int flag = 0;
			for (int i1 = 1; i1 <= till; i1++) {

				if (i % i1 == 0) {
					flag++;
				}

			}
			if (flag == 2) {
				System.out.println(i);
			}
		}
	}

	static void prime() {
		int p = 10;
		int flag = 0;
		for (int i = 1; i <= p; i++) {

			if (p % i == 0) {
				flag++;
			}

		}
		if (flag == 2) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a prime Number");
		}

	}

	static void oddArray() {
		int a[] = { 11, 21, 31, 41 };

		int count = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

			} else {
				count++;
			}
		}
		if (count == a.length) {
			System.out.println("Contains only odd number");
		} else {
			System.out.println("Contains even - odd number");
		}
	}

	static void arraySort() {

		int ar[] = { -10, 30, 20, 40, 10 };
		Arrays.sort(ar);

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

	static void fact() {
		int a = 5;
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}

		System.out.println(fact);
	}

	static void arrySortwithtemp() {

		int a[] = { 10, 20, 304, 050, 50 };

		for (int j = 0; j < a.length - 1; j++) {

			for (int i = 0; i < a.length - 1; i++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				System.out.println(a[j]);
			}

		}
	}

	static void palandrome() {
		String s = "kaaae	k";
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
//		max();
//		swap();
//		vowel();
//		oddArray();
//		arraySort();
//		fact();
//		prime();
//		printPrime();
//		arrySortwithtemp();
		palandrome();

	}

}

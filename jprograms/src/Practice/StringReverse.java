package Practice;

import java.util.Arrays;

public class StringReverse {

	static void rev() {
		String s = "adannak"; // kannada
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}

		System.out.println(s1);
	}

	static void rev(String s) {
		 s = "adannak"; // kannada
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
	}

	static void fizBuzz() {
		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			}

			else if (i % 3 == 0) {
				System.out.println("fizz ");
			} else if (i % 5 == 0) {
				System.out.println("buzz ");
			} else {
				System.out.println(i);
			}

		}
	}

	static void pal() {
		String s = "wow";
		String s1 = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}

		if (s1.equalsIgnoreCase(s)) {
			System.out.println("Palandrome");
		} else {
			System.out.println("Not a palandrome");
		}
	}

	static void efpal() {
		String s = "kannak";
		int i = 0, j = s.length() - 1;
		if (s.charAt(i) != s.charAt(j)) {
			System.out.println("Not a palandrome");
			System.exit(0);
		}
		i++;
		j--;

		System.out.println("Palandrome");
	}

	static void fact() {
		int a = 5;
		int fact = 1;

		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	static void maxArray() {
		int ar[] = { 11, 2, 6, 4, 5, 3 };
		int max = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}

		}
		System.out.println(max);
	}

	static void primenum() {
		int a = 1;
		int flag = 0;

		for (int i = 1; i <= a; i++) {

			if (a % i == 0) {
				flag++;
			}
		}
		if (flag == 2) {
			System.out.println("Prime Numer");
		} else {
			System.out.println("Not a prime number");

		}

	}

	static void fib() {
		int fib = 13;
		int t1 = 0, t2 = 1, sum = 0;
		for (int i = 0; i <= fib; i++) {

			System.out.print(t1 + " ");
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		System.out.println("\n" + t1);

	}

	static void anagram() {
		String s1 = "kannada";
		String s2 = "kanadan";
		int count = 0;

		if (s1.length() == s2.length()) {

			for (int i = 0; i < s1.length(); i++) {

				for (int k = 0; k < s2.length(); k++) {

					if (s1.charAt(i) == s2.charAt(k)) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
		if (count == s1.length()) {
			System.out.println("anagram");
		} else {
			System.out.println("Not an anagram");
		}

	}

	static void arrayRotation() {
		int ar[] = { 1, 2, 3, 4, 5, 6, 7 };

		int a = 4;

		for (int i = a; i <= ar.length - 1; i++) {
			System.out.print(ar[i] + " ");
		}
		for (int i = 0; i < a; i++) {
			System.out.print(ar[i] + " ");
		}
	}

	static void dupArray() {
		int ar[] = { 1, 2, 3, 4, 5, 6, 2, 3, 5 };
		Arrays.sort(ar);
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] == ar[i + 1]) {
				System.out.println(ar[i]);
			}
		}
	}

	public static void main(String[] args) {
//		rev();
//		fizBuzz();
//		pal();
//		efpal();
//		fact();
//		maxArray();
//		primenum();
//		fib();
//		anagram(); *

//		arrayRotation(); *
		dupArray();

	}

}

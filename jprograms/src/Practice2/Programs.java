package Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Programs {

	static void pal12() {

		String s1 = "WaooooW";
		int i = 0, j = s1.length() - 1;
		while (i <= j) {
			if (s1.charAt(i) != s1.charAt(j)) {
				System.out.println("Not a Palandrome");
				System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("Palandrome");

	}

	static void prime() {
		int val = 12;
		int count = 0;
		for (int i = 1; i <= val; i++) {
			if (val % i == 0) {
				count++;
			}
		}
		if (count == 2 || val == 1) {
			System.out.println("prime");
		} else {
			System.out.println("Not a prime");
		}

	}

	static void swap() {
		int a = 10;
		int b = 20;
		System.out.println("before " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after " + a + " " + b);

	}

	static void fib() {
		int s1 = 0, s2 = 1, s3 = 0;
		int fib = 10;

		System.out.print(s1 + " " + s2);
		for (int i = 2; i <= fib; i++) {

			s3 = s1 + s2;
			System.out.print(" " + s3);
			s1 = s2;
			s2 = s3;
		}

	}

	static void fact() {
		int a = 5;
		int fact = 1;

		for (int i = 1; i <= 5; i++) {
			fact = fact * i;

		}
		System.out.println(fact);
	}

	static void rev(String s1) {
//		String s1 = "kannada";
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
	}

	static void array() {
		int ar[] = { 90, 20, 10, 40, 100, 33, 22, 11, 2 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] >= max) {
				max = ar[i];
			}
			if (ar[i] <= min) {
				min = ar[i];
			}
		}
		System.out.println(min + " " + max);

		Arrays.sort(ar);
		for (int j = 0; j < ar.length; j++) {
			System.out.println(ar[j]);
		}
		System.out.println();
		for (int j = ar.length - 1; j >= 0; j--) {
			System.out.println(ar[j]);
		}

	}

	static void sortArray() {
		int ar[] = { 90, 20, 10, 40, 100, 33, 22, 11, 2 };

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[i] >= ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}

			}
		}

		// o/p
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

	static void col() {
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(30);
		obj.add(40);
		obj.add(22);
		obj.add(12);
		obj.add(444);
		obj.add(21);

		Collections.sort(obj);
		System.out.println(obj);
		Collections.sort(obj, Collections.reverseOrder());
		System.out.println(obj);

	}

	static void rev2() {
		String ar[] = { "car1", "car2", "car3" };
		String s1 = "";
		for (int i = ar.length - 1; i >= 0; i--) {
			s1 = s1 + ar[i] + " ";
		}
		System.out.println(s1);
		rev(s1);

	}

	public static void main(String[] args) {
//		pal12();
//		prime();
//		swap();
//		fib();
//		fact();
//		rev("lalalal");
//		array();
//		sortArray();
//		col();
//		rev2();
	}

}

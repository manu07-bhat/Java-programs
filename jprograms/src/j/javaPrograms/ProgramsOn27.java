package j.javaPrograms;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ProgramsOn27 {

	static void presentA() {
		String s = "java Developer";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'A' || s.charAt(i) == 'a') {
				count++;
			}
		}

		System.out.println(count);
	}

	static void vol() {
		String s = "Java Developer";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				count++;
			}
		}
		System.out.println(count);
	}

	static void vol2() {
		String s = "Java Developer";
		int a = 0;
		int e = 0;
		int i1 = 0;
		int o = 0;
		int u = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'A' || c == 'a') {
				a++;
			} else if (c == 'e' || c == 'E') {
				e++;
			} else if (c == 'i' || c == 'I') {
				i1++;
			} else if (c == 'o' || c == 'O') {
				o++;
			} else if (c == 'u' || c == 'U') {
				u++;
			}
		}
		System.out.println("a " + a);
		System.out.println("e " + e);
		System.out.println("i " + i1);
		System.out.println("o " + o);
		System.out.println("u " + u);
	}

	static void upperAndLower() {
		String s = "Java Developer";
		String lower = "";
		String upper = "";
		String mix = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {

				if (c >= 65 && c <= 90) {
					int a = (int) c + 32;
					char f = (char) a;
					lower = lower + f;

				} else {
					lower = lower + s.charAt(i);
				}

			} else {
				lower = lower + " ";
			}

		}
		System.out.println(lower);

		// Upper Case
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {

				if (c >= 97 && c <= 122) {
					int a = (int) c - 32;
					char f = (char) a;
					upper = upper + f;

				} else {
					upper = upper + s.charAt(i);
				}

			} else {
				upper = upper + " ";
			}

		}
		System.out.println(upper);

		// Mix
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {

				if (c >= 97 && c <= 122) {
					int a = (int) c - 32;
					char f = (char) a;
					mix = mix + f;

				} else if (c >= 65 && c <= 90) {
					int a = (int) c + 32;
					char f = (char) a;
					mix = mix + f;

				}

			} else {
				mix = mix + " ";
			}

		}
		System.out.println(mix);

	}

	static void upperAndLower2() {
		String s = "Java Developer";

		String lower = s.toLowerCase();
		System.out.println(lower);

		String upper = s.toUpperCase();
		System.out.println(upper);
	}

	static void helloWord() {
		System.out.println("  \"heloo world\"  ");
	}

	static void revString() {
		String ar[] = { "animal", "dog", "cat" };
		String ar2[] = new String[3];
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.print(ar[i] + " ");
			ar2[i] = ar[i];

		}
		System.out.println("\n--------------");

		for (int i = ar2.length - 1; i >= 0; i--) {
			System.out.println(ar2[i]);

		}

	}

	static void printString() {
		String s = "Java Mava";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
				System.out.print(s.charAt(i));
			} else {
				System.out.println(s.charAt(i));
			}

		}

	}

	static void checkWord() {
		String s = "I love Java and Java is so easy";
		String key = "aeasy";
		System.out.println(s.contains(key));

	}

	static void pattern() {
		String s = "hello";
		String res = "";
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (j == i) {

				res = res + s.charAt(i);
				System.out.println(res);
				j++;
			}

		}
	}

	static void minAndMaxArray() {
		int ar[] = { 5, 4, 3, 2, 1, 12, 15 };
		int max = 0;
		int min = Integer.MAX_VALUE;
		// Max
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > max) {

				max = ar[i];
			}
		}
		System.out.println(max);

		// min
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] < min) {

				min = ar[i];
			}
		}
		System.out.println(min);

	}

	static void ipAddress() {

		try {
			InetAddress IP = InetAddress.getLocalHost();
			System.out.println("IP of my system is := " + IP.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
//		presentA();
//		vol();
//		vol2();
//		upperAndLower();
//		upperAndLower2();
//		helloWord();
//		revString();
//		printString();
//		checkWord();
//		pattern();
//		minAndMaxArray();
		ipAddress();
	}

}

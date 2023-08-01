package j.strings;

import java.util.Scanner;

public class Stringproblems2 {

	static void toUpperCase(String s) {
		String t = " ";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				t = t + (char) (c - 32);
			} else {
				t = t + c;
			}

		}
		System.out.println(t);
	}

	static void toLowerCase(String s) {
		String t = " ";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				t = t + (char) (c + 32);
			} else {
				t = t + c;
			}

		}
		System.out.println(t);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		toLowerCase(s);

	}

}

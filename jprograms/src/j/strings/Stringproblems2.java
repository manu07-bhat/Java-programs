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

	static String indexOf(String s) {
		char key = 'a';
		for (int i = 0; i < s.length(); i++) {

			if (key == s.charAt(i)) {
//				System.out.println(s.charAt(i)+" "+i);
				return s.charAt(i) + " " + i;
			}
		}

		return "Value not presednt";
	}

	static String indexOf2(String s) {
		char key = 'a';
		int value = 2;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (key == s.charAt(i)) {
				count++;
			}
			if (count == value) {
				return "" + s.charAt(i) + " " + i;
			}
		}

		return "Value not presednt";
	}

	static String lastIndexOf(String s) {
		char key = 'a';
		char e = key;
		int s1 = 0;
		for (int i = 0; i < s.length(); i++) {

			if (key == s.charAt(i)) {
				s1 = i;

			}
		}
		if (s1 != 0) {
			return "" + s1;
		} else {
			return "Value not presednt";
		}

	}

	static String lastIndexOf2(String s) {
		char key = 'a';
		for (int i = s.length() - 1; i > 0; i++) {

			if (key == s.charAt(i)) {
//				System.out.println(s.charAt(i)+" "+i);
				return s.charAt(i) + " " + i;
			}
		}

		return "Value not presednt";

	}

	static String trim(String s) {
		String t = "";
		int f1 = 0, l1 = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				f1 = i;
				break;
			}
		}
		for (int i1 = s.length()-1; i1 > 0; i1--) {
			if (s.charAt(i1) != ' ') {
				l1 = i1;
				break;
			}
		}
		for (int i = f1; i <= l1; i++) {
			t += s.charAt(i);
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		trim(s);
		System.out.println(trim(s));

	}

}

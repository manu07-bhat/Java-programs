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
		for (int i1 = s.length() - 1; i1 > 0; i1--) {
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

	static char[] toCharArray(String s) {
		char f[] = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			f[i] = s.charAt(i);
		}
		return f;
	}

	static boolean equals() {
		String s1 = "javaA";
		String s2 = "javaa";
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	static void startWith(String s) {
		int count = 0;
		String key = "tap";
		for (int i = 0; i < key.length(); i++) {

			if (s.charAt(i) == key.charAt(count)) {
				count++;
			}
		}
		if (count == key.length()) {
			System.out.println("startswith");
		} else {
			System.out.println("not startwith");
		}

	}

	static void endsWith(String s) {
		String key = "don";
		int count = 0;
		for (int i = s.length() - key.length(); i < s.length(); i++) {

			if (s.charAt(i) == key.charAt(count)) {
				count++;
			}
		}
		if (count == key.length()) {
			System.out.println("startswith");
		} else {
			System.out.println("not startwith");
		}

	}

	static void contains(String s) {
		int count = 0;
		String t = "acad";

		for (int i = 0; i < s.length() && count < t.length(); i++) {

			if (s.charAt(i) == t.charAt(count)) {
				count++;
			} else {
				count = 0;
			}
		}
		if (t.length() == count) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

	static void replace(String s) {

		char f[] = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			f[i] = s.charAt(i);
		}

		char new_elmt = 'z';
		char old_elmt = 'a';
		for (int i = 0; i < f.length; i++) {

			if (f[i] == old_elmt) {
				f[i] = new_elmt;

			}
		}

		for (int i = 0; i < f.length; i++) {
			System.out.print(f[i]);
		}

	}

	static void subString(String s) {
		int startIndex = 1;
		String t = "";

		for (int i = startIndex; i < s.length(); i++) {
			t = t + s.charAt(i);
		}
		System.out.println(t);
	}
	
	static void subString_Endindex(String s) {
		int startIndex = 1;
		int endIndex = 5;
		String t = "";

		for (int i = startIndex; i < endIndex; i++) {
			t = t + s.charAt(i);
		}
		System.out.println(t);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
		System.out.println(equals());

	}

}

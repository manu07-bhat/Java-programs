package j.strings;

import java.util.Scanner;

public class Stringproblems3 {

	static void vowels(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				count++;
			}
		}
		System.out.println(count);
	}

	static void recerseString(String s) {
		String rev = ""; // reverse string

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i) + " ");
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

	static String palandrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev + " " + s);

		if (rev.length() == s.length()) {
			for (int i = 0; i < s.length(); i++) {
				if (rev.charAt(i) != s.charAt(i)) {
					return "not a palandrome";
				}
				return "Palandrome";
			}
		}
		return "not a palandrome";

//		if (rev.equals(s))  {
//			return "palandrome";
//		} else {
//			return "Not a palandrome";
//		}
	}

	static String efPlandrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j)) {

				return "not a palandrome";
			}
			i++;
			j--;
		}
		return "Palandrome";

	}

	static void countVowel(String s) {
		int count = 0;
		String v = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				count++;
				v = v + c;
				System.out.print(i);
			}
		}
		System.out.println();
		System.out.print(count + " " + v);
	}

	static void removeVowels(String s) {
		String v1 = "";
		String v2 = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				v1 = v1 + c;
			} else {
				v2 = v2 + c;
			}
		}
		System.out.println(v2);

	}

	static void countSpaces(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count); // add count+1 this will give o/p give count of words
	}

	static void cutspaces(String s) {
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				s1 = s1 + s.charAt(i);
			}
		}
		System.out.println(s1);
	}

	static String reverseString(String s) {
		char c[] = s.toCharArray();
		int i = 0, j = s.length() - 1;

		while (i <= j) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
		}
		return s = new String(c);

	}

	static void subString(String st) {
		int n = st.length();
		for (int len = 1; len <= n; len++) {
			for (int i = 0; i <= (n - len); i++) {

				for (int j = i; j <= (i + len) - 1; j++) {

					System.out.print(st.charAt(j));
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	static void subString3(String st, int k) {
		int n = st.length();

		for (int s = 0; s <= n - k; s++) {
			for (int e = s; e <= (s + k) - 1; e++) {
				System.out.print(st.charAt(e));
			}
			System.out.println();
		}
	}

	static void balOrNot(String s) {
		int br = 0, count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				br++;
			} else 
			{
				if (br <= 0) {
					count++;
				} else
				{
					br--;
				}

			}
		}
		System.out.println(br+count);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
//		vowels(s);
//		recerseString(s);
//		System.out.println(efPlandrome(s));
//		countVowel(s);
//		removeVowels(s);
//		countSpaces(s);
//		cutspaces(s);
//		System.out.println(reverseString(s));
//		subString(s);
//		subString3(s, 5);
		balOrNot(s);

	}

}

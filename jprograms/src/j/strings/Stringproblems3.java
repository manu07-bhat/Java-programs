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
		System.out.print(count+" "+v);
	}
	
	
	static void removeVowels(String s)
	{
		String v1= "";
		String v2="";
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'o' || c == 'O' || c == 'u'
				|| c == 'U') {
			v1 = v1 + c;
		}else
		{
			v2 = v2 + c;
		}
	}
	System.out.println(v2);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
//		vowels(s);
//		recerseString(s);
//		System.out.println(efPlandrome(s));
//		countVowel(s);
		removeVowels(s);

	}

}

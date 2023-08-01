package j.strings;

import java.util.Scanner;

public class Stringproblems3 {

	static void vowels(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'i'
				|| c=='I'	|| c=='o' || c=='O' || c=='u'||c=='U') {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		vowels(s);
	}

}

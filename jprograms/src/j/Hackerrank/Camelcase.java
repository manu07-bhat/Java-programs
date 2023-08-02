package j.Hackerrank;

import java.util.Scanner;

public class Camelcase {

	static void camCase(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println(count+1);
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String s =scan.nextLine();
	camCase(s);
	}

}

package j.strings;

import java.util.StringTokenizer;

public class Stringtockens {

	public static void main(String[] args) {

		String s = "java sql ai";
		StringTokenizer tk = new StringTokenizer(s, "a");

		while (tk.hasMoreTokens()) {
			System.out.println(tk.nextToken());

		}
	}

}

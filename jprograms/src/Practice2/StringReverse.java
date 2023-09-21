package Practice2;

public class StringReverse {

	public static void main(String[] args) {

		String s1 = "kannada";

		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
			s2 = s2 + s1.charAt(i);
		}
		System.out.println("\n" + s2);
	}

}

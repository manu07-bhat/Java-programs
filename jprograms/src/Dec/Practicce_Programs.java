package Dec;

public class Practicce_Programs {

	static void pal() {
		// palandrome
		String s1 = "WOW";
		int i = 0, j = s1.length() - 1;

		while (i <= j) {
			if (s1.charAt(i) != s1.charAt(j)) {
				System.out.println("Not a palandrome");
				System.exit(0);
			} else {
				i++;
				j--;
			}
		}
		System.out.println("Palandrome");

	}

	public static void main(String[] args) {
		pal();
	}

}

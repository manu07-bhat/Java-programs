package Practice;

public class isPowerofTwo {

	static boolean isPower(int a) {
		if (a == 0) {
			return false;
		}

		while (a != 1) {
			if (a % 2 != 0) {
				return false;

			} else {
				a = a / 2;
			}
		}
		return true;
	}

	static String pal(String s) {
		int i = 0, j = s.length() - 1, count = 0;
		;

		while (i <= j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
				count++;
			} else {
				return "Not a Palandrome";
			}
		}
		return "Palandrome";

	}

	public static void main(String[] args) {
//		System.out.println(isPower(64));
//		System.out.println(pal("121"));
	}

}

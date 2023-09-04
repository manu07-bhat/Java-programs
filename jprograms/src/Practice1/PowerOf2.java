package Practice1;

public class PowerOf2 {

	static boolean isPowerOfTwo(int n) {
		if (n == 0)
			return false;

		while (n != 1) {
			if (n % 2 != 0) {
				return false;
			} else {
				n = n / 2;
			}

		}
		return true;
	}

	static String len(String s) {
		int a = s.length();
		System.out.println(s.length());
		String s1 = Integer.toString(a);
		return s1;
	}

	public static void main(String[] args) {
//		System.out.println(isPowerOfTwo(64));
		len("lap");
	}

}

package Practice1;

public class revString {

	static void rev() {
		String s2 = "I love Java";

		char[] ar = new char[s2.length()];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = s2.charAt(i);
		}

		String s1[] = { "i", "love", "India" };
		for (int i = s1.length - 1; i >= 0; i--) {

			System.out.print(s1[i] + " ");
		}

	}

	public static void main(String[] args) {
		rev();
	}

}

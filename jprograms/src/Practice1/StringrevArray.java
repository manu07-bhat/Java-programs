package Practice1;

public class StringrevArray {

	public static void main(String[] args) {
		String s1[] = { "cook", "book", "eat" };
		String s2 = "";

		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		System.out.println("=============");
		// input
		for (int i = s1.length - 1; i >= 0; i--) {
			s2 = s2 + s1[i] + " ";
		}
		System.out.println(s2);
		System.out.println("=============");
		rev(s2);

	}

	private static void rev(String s2) {
		for (int i = s2.length() - 1; i >= 0; i--) {
			System.out.print(s2.charAt(i));
		}
	}

}

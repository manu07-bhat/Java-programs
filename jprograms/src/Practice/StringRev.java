package Practice;

public class StringRev {

	public static void main(String[] args) {
		String s1 = "hello";
		StringBuilder sb = new StringBuilder(s1);
		System.out.println(sb.reverse());

		String s2 = "";
		for (int i = s1.length()-1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);

	}

}

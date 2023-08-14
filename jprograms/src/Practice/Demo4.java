package Practice;

class String1 {

	String s = "kana";

	void main() {
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			System.out.println(c);
		}
	}
}

public class Demo4 {

	public static void main(String[] args) {
		String1 s = new String1();
		s.main();
	}

}

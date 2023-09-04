package Practice1;

public class StringComp {

	static void comp() {
		String s1 = "java";
		String s2 = "javaa";

		if (s1.equals(s2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	static void addInt() {
		int a = 245;
		String s = Integer.toString(a);
		int s1 = 0;

		for (int i = 0; i < s.length(); i++) {
			s1 = s1 + (int)(s.charAt(i))-32;
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {
//		comp();
		addInt();
	}

}

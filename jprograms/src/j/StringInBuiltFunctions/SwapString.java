package j.StringInBuiltFunctions;

public class SwapString {

	public static void main(String[] args) {

		// Swap 2 string without temp string

		String s1 = "Python";
		String s2 = "java";
		System.out.println(s1 + " " + s2);
		// Pythonjava
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println(s1 + " " + s2);

		// Using temp
		s1 = "Python";
		s2 = "java";
		System.out.println(s1 + " " + s2);
		String temp = "";

		temp = s1;
		s1 = s2;
		s2 = temp;

		System.out.println(s1 + " " + s2);

	}

}

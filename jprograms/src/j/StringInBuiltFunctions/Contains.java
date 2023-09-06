package j.StringInBuiltFunctions;

public class Contains {

	public static void main(String[] args) {

		String s1 = "java is GOOD language";

		String s = "is java GOOD language";
		Boolean b = s1.contains(s); // Returns true if the characters exist and false

//		System.out.println(b);
//		System.out.println(s1.contains(s));

		Boolean v = s1.contentEquals(s);

		System.out.println(s1.contentEquals(s));
		System.out.println(v);

	}

}

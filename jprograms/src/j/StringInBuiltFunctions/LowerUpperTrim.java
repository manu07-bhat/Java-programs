package j.StringInBuiltFunctions;

public class LowerUpperTrim {

	public static void main(String[] args) {

		String s1 = "JAVA";

		System.out.println(s1.toLowerCase());

		s1 = "Java is a good Program ";
		System.out.println(s1.toUpperCase());

		s1 = "              Java is a good Program               ";
		System.out.println(s1.trim());

		

	}

}

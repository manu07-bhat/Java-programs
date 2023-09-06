package j.StringInBuiltFunctions;

public class SubString {

	public static void main(String[] args) {

		String s1 = "Java is a good Program ";
		System.out.println(s1.substring(0, 11));

		s1 = "Java";
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.substring(i));
		}
		System.out.println();
		s1 = "Java";
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.println(s1.substring(i));
		}

		s1 = "Java is a good Program ";
		String s2 = "good";

		System.out.println(s1.substring(10));
		
		
	
		
		
		

	}

}

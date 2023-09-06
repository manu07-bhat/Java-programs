package j.StringInBuiltFunctions;

public class Equals {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.matches(s2));
		System.out.println();
		
		 s1 = "Hello";
		 s2 = "hello";
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.format(s2, "hel")); //format
		
		System.out.println(s1.getBytes());
		
		
	}

}

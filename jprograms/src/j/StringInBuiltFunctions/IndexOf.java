package j.StringInBuiltFunctions;

public class IndexOf {

	public static void main(String[] args) {
		String s1 = "Hello planet earth, you are a great planet.";
		String s2 = "h";
		
		System.out.println(s1.indexOf(s2));
		s2 = "ear";
		System.out.println(s1.indexOf(s2));
		
		s2 = "net";
		System.out.println(s1.indexOf(s2));
		
	}

}

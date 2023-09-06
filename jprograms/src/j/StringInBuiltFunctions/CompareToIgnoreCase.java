package j.StringInBuiltFunctions;

public class CompareToIgnoreCase {

	public static void main(String[] args) {
	
		String s1 = "Java is good";
		String s2 = "java is good";
		
		int s3 = s1.compareToIgnoreCase(s2);
		
		System.out.println(s3);
		System.out.println(s1.compareToIgnoreCase(s2));
	}

}

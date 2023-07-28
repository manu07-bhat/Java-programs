package j.strings;

public class stringComparation {

	static void references(String s1, String s2)
	{
		if (s1 == s2) {
			System.out.println("Same References");
		}
		else
		{
			System.out.println("No same references");
		}
	}
	
	static void values(String s1, String s2)
	{
		if (s1.equals(s2)) {
			System.out.println("Same Values");
		}
		else
		{
			System.out.println("Different Values");
		}
	}
	
	static void ignoreCase(String s1, String s2)
	{
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("same value using equalIgnoreCase");
		}
		else
		{
			System.out.println("not an same value");
		}
	}
	
	static void comparation(String a1, String a2 )
	{
		a1 = "JAVA";
		a2 = "PYTHON";
		String s3 = a1+ a2;
		String s4 = "JAVA" + "PYTHON";
		
		String s5 = "JAVA" + "PYTHON";	// same references
		String s6 = "JAVA" + "PYTHON";
		
		String s7= "JAVA" + a2;
		String s8= "JAVA" + a2;
		
		String s9 = "JAVA".concat("PYTHON");// same references
		String s10 = "JAVA".concat("PYTHON");
		
		
		references(s9, s10);
		values(s9, s10);
		
		
	}
	
	public static void main(String[] args) {

		String s1 = "JAVA";
		String s2 = "JAVa";
		
		comparation(s1, s2);
	}

}

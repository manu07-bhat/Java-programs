package j.StringInBuiltFunctions;

public class CharAt {

	static void word()
	{
		String s = "Java Language";
		
		char c =s.charAt(5); // blank space is also included
		char c1 =s.charAt(0);
		System.out.println(c1+" "+c);
	}

	public static void main(String[] args) {
		word();
	}

}

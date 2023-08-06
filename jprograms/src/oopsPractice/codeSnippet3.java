package oopsPractice;

public class codeSnippet3 {
	
	public static void tap(String s)
	{
		System.out.println("String");
	}
	
	public static void tap(Object o)
	{
		System.out.println("Object");
	}

	public static void main(String[] args) {
		tap(null);		// most suited one will display
	}

}

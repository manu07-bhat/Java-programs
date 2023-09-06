package j.StringInBuiltFunctions;

public class CodePointAt {

	public static void main(String[] args) {

		String s = "Java a programing language";

		int c = s.codePointAt(1); // index alphabet values // unicode values

		System.out.println(c);

		int j = s.codePointBefore(2); // unicode values before index value if 2 is giving 1 index is taken
		System.out.println(j);
		
		int b = s.codePointCount(0,7); 

		System.out.println(b);
		

	}

}

package j.StringInBuiltFunctions;

public class Concat {

	public static void main(String[] args) {

		String s1 = "Java ";
		String s2 = "Python ";
		String s3 = "C# ";

		String s4 = s1.concat(s2.concat(s3.concat(s3)));

		System.out.println(s4);
		System.out.println(s1.concat(s2.concat(s3)));
	}

}

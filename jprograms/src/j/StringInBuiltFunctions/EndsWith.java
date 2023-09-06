package j.StringInBuiltFunctions;

public class EndsWith {

	public static void main(String[] args) {
		String s = "hello";
		String s1 ="llo";
		boolean b = s.endsWith("lo");

		System.out.println(s.endsWith(s));
		System.out.println(b);

		boolean b1 =s.startsWith("el");
		System.out.println(b1);
		
	}

}

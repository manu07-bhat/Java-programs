package j.StringInBuiltFunctions;

public class CopyValueOf {

	public static void main(String[] args) {
		
		char ch[] = {'H', 'e','l','l','o','o' };
		
		String s ="";
		
		System.out.println(s.copyValueOf(ch));
		System.out.println(s.copyValueOf(ch,0,5));
		
	}

}

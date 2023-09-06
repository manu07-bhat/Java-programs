package j.StringInBuiltFunctions;

public class Replace {

	public static void main(String[] args) {

		String s1 = "Manoj is a good boy Manoj";

		System.out.println(s1.replace("Manoj", "jocker"));
		System.out.println(s1);

		System.out.println(s1.replaceFirst("Manoj", "jocker"));
		
		String s2 = "good";
		String s3 [] =s1.split(s2);
		
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]);
		}
		
	}

}

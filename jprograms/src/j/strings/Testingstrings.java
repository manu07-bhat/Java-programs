package j.strings;

public class Testingstrings {

	static void arrayString() {
		String s[] = { "kan", "nan", "san" };

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	static void string() {
//		String s = "ABCD";
//		System.out.println(s.charAt(2));
//		 s = s.concat("bbcs");
//		System.out.println(s);
		
//		String s1 = "ACD";
//		String s2 = "ACD";
//		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equalsIgnoreCase(s2));
//		System.out.println(s1.compareTo(s2));
		
		
		String a1 = "Sachin";
		System.out.println(a1.substring(1,6));
		System.out.println(a1.indexOf('b'));
		
		System.out.println(a1.toLowerCase());
		System.out.println(a1.toUpperCase());
	}

	public static void main(String[] args) {
		string();
	}

}

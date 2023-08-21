package j.javaPrograms;

public class Palindrome {
		
	static void pal()
	{
		String s ="teaaet";
		String s1 ="";
		
		for (int i = s.length()-1; i >=0; i--) {
			s1 = s1+ s.charAt(i);
		}
		if (s1.equalsIgnoreCase(s)) {
			System.out.println("Palindorme");
		}else
		{
			System.out.println("not a Palindrome");
		}
	}

	public static void main(String[] args) {
		pal();
	}

}

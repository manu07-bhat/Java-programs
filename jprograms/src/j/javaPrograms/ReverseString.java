package j.javaPrograms;

public class ReverseString {
	
	static void rev()
	{
		String s ="KANNADA";
		
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i)+" ");
		}
	}

	
	public static void main(String[] args) {
		rev();
	}

}

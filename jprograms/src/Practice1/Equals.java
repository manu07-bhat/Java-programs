package Practice1;

public class Equals {

	public static void main(String[] args) {
		String s1 = "manoj";
		String s2 = "manoj";
		String s3 = new String("manoj");

		System.out.println(s1.equals(s3)); // data comparation
		System.out.println(s3 == s2); // object reference comparation 
	}

}

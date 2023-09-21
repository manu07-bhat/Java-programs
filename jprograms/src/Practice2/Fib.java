package Practice2;

public class Fib {

	public static void main(String[] args) {
		int fib = 10;
		int s1 = 0, s2 = 1, s3;
		System.out.print(s1 + " " + s2);
		for (int i = 2; i < fib; i++) {
			s3 = s1 + s2;
			System.out.print(" " + s3);
			s1 = s2;
			s2 = s3;
		}

	}

}

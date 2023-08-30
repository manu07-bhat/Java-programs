package Practice1;

public class Programs1 {

	static void fib() {
		int s1 = 0, s2 = 1, s3 = 0;
		int val = 7;
//		System.out.print(s1 + " " + s2);
		for (int i = 2; i <= val; i++) {

			s3 = s1 + s2;
//			System.out.print(" " + s3);
			s1 = s2;
			s2 = s3;
		}
		System.out.println(s3);
	}

	static void countDigit() {
		int val = 12345;
		String s = Integer.toString(val);

		System.out.println(s.length());
	}

	static void countDigit2() {
		int val = 123456;
		int count = 0;
		for (int i = 1; i <= val; i++) {
			val = val / 10;
			count++;
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
//		fib();
//		countDigit();
//		countDigit2();
		
	}

}

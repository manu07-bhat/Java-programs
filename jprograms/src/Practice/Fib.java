package Practice;

public class Fib {

	static void fibo() {
		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; i++)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

	static void fib1() {
		int s1 = 0, s2 = 1, count = 5, s3;

		System.out.print(s1 + " " + s2);
		for (int i = 2; i <= count; i++) {
			s3 = s1 + s2;
			System.out.print(" " + s3);
			s1 = s2;
			s2 = s3;
		}
	}

	public static void main(String[] args) {
		fib1();
	}

}

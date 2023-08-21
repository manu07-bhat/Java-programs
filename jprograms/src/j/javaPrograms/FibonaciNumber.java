package j.javaPrograms;

public class FibonaciNumber {

	static void fib() {
		int a = 5;
		int s1 = 0, s2 = 1;
		for (int i = 0; i <= 5; i++) {
			System.out.print(s1+" ");
			s1 = s1+s2;
			s2 = s1;
		}

	}

	public static void main(String[] args) {
		fib();
	}

}

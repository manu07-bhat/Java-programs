package Practice;

public class LcmGcd {

	static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		} else {
			return gcd(b % a, a); // recursion function/Method
		}
	}

	static int lcm(int a, int b) {
		return (a / gcd(a, b)) * b;
	}

	public static void main(String[] args) {
		System.out.println(gcd(12, 18));
		System.out.println(lcm(12, 18));
	}

}

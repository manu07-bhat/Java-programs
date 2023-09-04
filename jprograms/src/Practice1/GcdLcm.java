package Practice1;

public class GcdLcm {
	// Recursive method to return gcd of a and b
	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	// method to return LCM of two numbers
	static int lcm(int a, int b) {
		return (a / gcd(a, b)) * b;
	}

	public static void main(String[] args) {
		System.out.println(gcd(18, 0));
		System.out.println(lcm(12, 18));
	}

}

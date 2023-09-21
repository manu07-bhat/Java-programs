package Practice2;

public class Prime {

	public static void main(String[] args) {
		int a = 15;
		int count = 0;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}

		if (count == 2 || a == 1) {
			System.out.println("Prime");
		} else {
			System.out.println("Not a Prime");
		}

	}

}

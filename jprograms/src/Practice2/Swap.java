package Practice2;

public class Swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("Before : " + a + " " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After : " + a + " " + b);

		System.out.println("====================");
		System.out.println("Before : " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After : " + a + " " + b);

	}

}

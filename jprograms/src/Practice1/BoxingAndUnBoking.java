package Practice1;

public class BoxingAndUnBoking {

	public static void main(String[] args) {
		// WrapperClass and Primitive dataType

		int a1 = 10; // Boxing
		Integer b1 = new Integer(a1);
		System.out.println(b1);

		Integer b2 = new Integer(44);
		int a2 = b2.intValue(); // un-Boxing
		System.out.println(a2);

		/*
		 * Auto Boxing int a = 10; Integer b = a; System.out.println(b);
		 * Auto un-Boxing
		 * Integer c = 30; int d = c; System.out.println(d);
		 * 
		 */
	}
}

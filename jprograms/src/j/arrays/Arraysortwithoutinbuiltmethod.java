package j.arrays;

public class Arraysortwithoutinbuiltmethod {

	public static void main(String[] args) {
		// wihtout in built method
		int a[] = { 90, 40, 50, -10, 20 };
		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int tmp = 0;
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}

			System.out.print(a[i] + " ");
			
			b[i] = a[i];
		}
		System.err.println("\n");
		System.out.println("Sorted array in new array");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}

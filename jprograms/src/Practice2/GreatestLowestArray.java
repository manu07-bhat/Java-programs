package Practice2;

public class GreatestLowestArray {

	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, 9, 444444, 40, 10, 220, 44 };
		int low = Integer.MAX_VALUE;
		int high = 0;

		for (int i = 0; i < ar.length; i++) {

			if (low >= ar[i]) {
				low = ar[i];
			}
			if (high <= ar[i]) {
				high = ar[i];
			}
		}

		System.out.println(low);
		System.out.println(high);

	}

}

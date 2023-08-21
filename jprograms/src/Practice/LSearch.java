package Practice;

public class LSearch {

	static void lsearch(int ar[]) {
		int key = 5;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == key) {
				System.out.println(ar[i]);
				System.exit(0);
			}
		}
		System.out.println("Element not found");
	}

	static void sort(int a[])
	{

			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					int tmp = 0;
					if (a[i] < a[j]) {
						tmp = a[i];
						a[i] = a[j];
						a[j] = tmp;
					}
				}

				System.out.print(a[i] + " ");
		}
	}
	
	static void bubbleSort(int ar[]) {
		for (int i = 0; i < ar.length - 1; i++) {

			for (int j = 0; j < ar.length - i - 1; j++) {

				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
			
		}

	}
	
	public static void main(String[] args) {
		int ar[] = { 5, 4, 3, 2, 1 };
//		lsearch(ar);
//		sort(ar);
//		bubbleSort(ar);
	}

}

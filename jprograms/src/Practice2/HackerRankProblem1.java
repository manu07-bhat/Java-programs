package Practice2;

import java.util.Arrays;
import java.util.Scanner;

public class HackerRankProblem1 {

	public static int sockMerchant(int n) {
		// Write your code here
		int pair = 2, var = 0; // 2 1=3,
		Scanner scan = new Scanner(System.in);
		int ar[] = new int[n];
		// input
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}

		// logic
		Arrays.sort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}

		for (int i = 0; i < ar.length; i++) {
			int count = 0; //
			for (int j = 0; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
				}
			}
			var = var + (count / pair);

		}

		return var;

	}

	public static void main(String[] args) {
		System.out.println(sockMerchant(9));
	}

}

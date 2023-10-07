package HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

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

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < ar.length; i++) {

			if (map.containsKey(ar[i])) {
				map.put(ar[i], map.get(ar[i]) + 1);
			} else {
				map.put(ar[i], 1);
			}

		}
		
		Set<Entry<Integer, Integer>> set1 = map.entrySet();
		for (Entry<Integer, Integer> entry : set1) {
			 var =var + entry.getValue()/2;
		}
		
		System.out.println(map);

		return var;

	}

	public static void main(String[] args) {
		System.out.println(sockMerchant(10));
	}

}

package j.Hackerrank;

import java.util.Scanner;

public class Migratorybird {
	// Migratory bird using array
	static int birds(int []a)
	{
		int [] bird = new int [a.length];
		for (int i = 0; i < a.length; i++) {
			bird[ a[i] ] ++; 
		}
		int maxIndex =0, max =-1;
		for (int i = 0; i < bird.length; i++) {
			if(bird[i]>max)
			{
				max = bird[i];
				maxIndex =i;
			}
		}
		return maxIndex;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int [n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println(birds(a));

	}

}

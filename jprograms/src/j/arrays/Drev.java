package j.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Drev {
			// drev and frinds problem code chef
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int k = scan.nextInt();
	int n[] = new int [k];
	
	for (int i = 0; i < n.length; i++) {
		n[i] =  scan.nextInt();
	}
	
	Arrays.sort(n);
	
	int count=0;
	for (int i = 0; i < n.length-1; i++) {
		 if (n[i] != n[i+1]) {
			count++;
		}
	}
	System.out.println(count+1);
	}

}

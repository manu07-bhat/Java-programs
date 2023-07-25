package j.Hackerrank;

import java.util.Scanner;

public class Circularrarrayrotation {
	
	static int[] circularArrayR(int a[], int k ,int q[])
	{
		int res[] = new int [q.length];
		
		int b[] = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			b[(i+k)%a.length] = a[i];
		}
		
		for (int i = 0; i < q.length; i++) {
			res[i] =b[q[i]];
		}
		return res;
	}
	
	
	//not proper
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= 3;
	int k = 2;
	int q=3;

	int a[]	= new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]= scan.nextInt();
	}
	int q1[]	= new int[q];
	for (int i = 0; i < q1.length; i++) {
		q1[i]= scan.nextInt();
	}

	
	for (int i = 0; i < q1.length; i++) {
		System.out.println(circularArrayR(a, k, q1));
	}
	}

}

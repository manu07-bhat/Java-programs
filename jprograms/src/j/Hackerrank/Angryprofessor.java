package j.Hackerrank;

import java.util.Scanner;

public class Angryprofessor {
	Scanner scan = new Scanner(System.in);
	void professor(int n, int k)
	{
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		
		int count=0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]<=0)
			{
				count++;
			}
		}
		if(count >= k)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int n= scan.nextInt();
	int k = scan.nextInt();
	Angryprofessor obj = new Angryprofessor();
	obj.professor(n, k);

	}

}

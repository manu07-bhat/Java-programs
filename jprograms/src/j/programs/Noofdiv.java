package j.programs;

import java.util.Scanner;

public class Noofdiv {
	
	static void div (int l, int r, int k)
	{
		int count = 0;
		for (int i = l; i <= r; i++) {
			
			if(i%k == 0 )
			{
				 count++;
			}
			
		}
	System.out.println(count);
		
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int l =scan.nextInt();
	int r =scan.nextInt();
	int k =scan.nextInt();
	div(l, r, k);

	}

}

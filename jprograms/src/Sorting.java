import java.util.Scanner;

public class Sorting {

	static void bubbleSort(int ar[])
	{
		for (int i = 0; i < ar.length-1; i++) {
			
			for (int j = 0; j < ar.length-i-1; j++) {
				
				if (ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner  scan = new Scanner (System.in);
		int n = scan.nextInt();
		
		int ar[] =  new int [n];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		bubbleSort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		
//		int ar1[] =bubbleSort(ar);
//		
//		for (int i = 0; i < ar1.length; i++) {
//			System.out.print(ar1[i]+" ");
//		}
		
		
	}

}

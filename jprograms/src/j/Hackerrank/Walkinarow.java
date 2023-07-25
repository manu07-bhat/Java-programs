package j.Hackerrank;

public class Walkinarow {

	static int wall(int a[])
	{
		int height = 6, sum =0;
		
		int perhigth[] = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= height) {
				perhigth[i]++;
			}
			else
			{
				for (int j = 0; j < 2; j++) {
					perhigth[i]++;
				}
			}
		}
		
		for (int i = 0; i < perhigth.length; i++) {
			sum = sum+  perhigth[i];
		}
		
		return sum;
		
	}
	
	static int wall2(int a[])
	{
		//efficient way
		int height = 6, sum =0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] <= height) {
				sum++;
			}
			else
			{
				sum = sum +2;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
	int ar[] = {6,51,14,7,5};
	System.out.println(wall2(ar));
	
	}

}

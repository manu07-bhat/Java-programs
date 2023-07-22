package j.arrays;

public class Testonarray {

	public static void main(String[] args) {
		// Drawbacks and testing on arrays
		
		int []a = new int[5];
		a[1] = 10;
		a[2] = (int)99.8; //type casting can be done
		
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
	}

}

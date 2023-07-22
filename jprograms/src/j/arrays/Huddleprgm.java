package j.arrays;

public class Huddleprgm {

	public static void main(String[] args) {
		// Hacker Rank question
		//Max of an aray
		
		int x[] = {0,2,1,5,10,5};
		
		int max =0;
		
		for (int i = 0; i < x.length; i++) {
			
			if(max < x[i])
			{
				max = x[i];
			}
		}
		System.out.println("MAX IS "+max);
		
		
	}

}

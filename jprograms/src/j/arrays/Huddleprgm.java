package j.arrays;

public class Huddleprgm {
	// Hacker Rank question
	static void MAX()
	{
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
	
	void MIN()
	{
		int y[] = {0,-2,1,5,10,-5};
		
		int min =0;
		
		for (int i = 0; i < y.length; i++) {
			
			if(min > y[i])
			{
				min = y[i];
			}
			
		}
		
		System.out.println(min);
	}
	public static void main(String[] args) {
		Huddleprgm obj = new Huddleprgm();
		obj.MIN();
		MAX(); //static calling
		
		
	}

}

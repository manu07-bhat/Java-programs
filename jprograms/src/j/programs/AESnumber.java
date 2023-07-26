package j.programs;

public class AESnumber {
	
	static boolean aESnum(int n)
	{
		int count= 0;
		for (int i = 1; i <=n; i++) {
			
			if(n %i == 0)
			{
				count++;
			}
		}
		
		if (count == 4) {
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		int l=1;
		int r=20;
		int aes =0;
	//System.out.println(aESnum(10));

	for (int i = l; i <= r; i++) {
		if (aESnum(i))    //aESnum(i) == true
		{ 
			aes++;
		}
	
	}System.out.println(aes);
	}

}

package j.arrays;

public class Simplearray {

	void aD()
	{
		//1 D
//		int []a= new int[6]; //one dimens		
//		
//		a[0] = 300;
//		a[2] = -121;
//		a[5] = 432;
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+" ");
//		}
		
		System.out.println();
		//2 D
		int [][]b =new int[2][5];
		
		b[1][4] =10;
		b[0][2] =20;
		
		
		for (int i1 = 0; i1 < b.length; i1++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(b[i1][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
	
		Simplearray obj = new Simplearray();
		obj.aD();
		
		

	}

}

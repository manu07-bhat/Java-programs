package j.programs;

public class cmdLineArgs {


	public static void main(String[] args) {
		//cmdLine agrs
		System.out.println("Tap academy");
		System.out.println(args[0]+args[2]+"\n");
		//got to run > run config > add argumnets in arguments section 
		
		//to find the value/capacity  for datatypes
		System.out.println(Double.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		System.out.println(Character.MAX_VALUE+"\n");
		
		int k =100_000_000; //_ for understanding
		System.out.println(k);
		//char holds 2 bytes bec java follows ASCII code system
		
		//type casting
		int a=10;
		float b=a;  //Implicit type casting
		System.out.println(b+"\n");
		
		int c =(int)b; //Explicit type casting
		System.out.println(c);
		
		//ex1
		byte f= 127;
		f= (byte)(f+1);
		System.err.println(f);
		
		//ex2
		int a1=45;
		int b1=32;
		
		float c1 =a1/b1;  //int/int 
		int c2 = a1/b1;
		System.err.println(c1+"       "+c2);
		
		
		//ex3 
		char g='G'; //g value 71
		
		System.out.println(g+71);
		System.out.println((char)(g+71));
		System.out.println((char)(71));
		
	}

}

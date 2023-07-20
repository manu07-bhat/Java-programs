package j.programs;

public class MthodsVar {
	//Instance variable //local variable
	//Object creation
			
	int a=10;        //Instance variable  | Heap memory | default value by JVM
	int b=20;
	String s ;
	
	void add() 
	{
		int a=20;   //Local variable  |  stack memory | NO default value by JVM
		int b=20;
		String s="  kannada";
		
		System.err.println(a+b+s);
	}
	

	
	public static void main(String[] args) {
	
		MthodsVar obj = new MthodsVar(); //object creation
		
		obj.add();  //calling an method
		System.out.println(obj.s); //calling  Instance variable
	}

}

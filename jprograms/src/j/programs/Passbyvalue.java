package j.programs;

public class Passbyvalue {
	
	int add(int a, int b)
	{
		System.out.println(a+"  "+b); 
		a=100;
		b=200;
		int c =a+b;
		return c;
	}
	

	public static void main(String[] args) {
		// pass by value
		Passbyvalue val = new Passbyvalue();
		int num1 =10;
		int num2 =20;
	
		int res = val.add(num1, num2);
		System.out.println(res);

	}

}

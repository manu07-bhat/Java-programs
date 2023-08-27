package j.javaPrograms;

public class ArgumentConstructor {
	String name, color;
	int age ;
	
	ArgumentConstructor(int a, String b, String c )
	{
//		name = "harshu";
//		color = "pink";
//		age = 60;
		
		name = b;
		color = c;
		System.out.println(a+" "+b+" "+c);
	}

	public static void main(String[] args) {
		ArgumentConstructor ag = new ArgumentConstructor(10, "jack", "blue");
	}

}


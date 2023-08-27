package j.javaPrograms;

public class UserDefinedConstructor2 {
	String name, color;
	int age;
	static String car="Maruti"; 
	
	UserDefinedConstructor2() //Constructor Declaration
	{
		//Constructor Body
		name = "Manoj";
		color = "Black";
		age =43;
	}
	
	

	public static void main(String[] args) {
		UserDefinedConstructor2 u2 = new UserDefinedConstructor2();
		System.out.println(u2.age);
		System.out.println(u2.name);
		System.out.println(u2.color);	
		
		System.out.println(UserDefinedConstructor2.car);
	}

}

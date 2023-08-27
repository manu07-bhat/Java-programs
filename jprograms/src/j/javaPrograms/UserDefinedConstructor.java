package j.javaPrograms;

public class UserDefinedConstructor {
	
	UserDefinedConstructor(int a)
	{
		System.out.println("User defined "+a);
	}

	public static void main(String[] args) {
		UserDefinedConstructor ud = new UserDefinedConstructor(10);
	}

}

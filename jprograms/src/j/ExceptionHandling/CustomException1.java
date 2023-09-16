package j.ExceptionHandling;

class UserNotFound extends Exception {
	UserNotFound(String msg)
	{
	    System.out.println(msg);	
	}
	public String getMessage() {

		return "UserNot Found";
	}
}



public class CustomException1  {

	public static void main(String[] args) {

		int age =21/0;
		try {
			if (age>50) {
				System.out.println(true);
			}
			else
			{
				throw new UserNotFound("Inavlid age");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

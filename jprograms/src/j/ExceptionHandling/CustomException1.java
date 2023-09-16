package j.ExceptionHandling;

class UserNotFound extends Exception {
	UserNotFound() {
		System.out.println("msg");
	}

}

public class CustomException1 {

	public static void main(String[] args) throws UserNotFound {

		int age = 21;

		if (age > 50) {
			System.out.println(true);
		} else {
			throw new UserNotFound();
		}

	}

}

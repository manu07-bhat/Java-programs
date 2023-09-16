package Practice1;

class UserDefine extends Exception {

	public UserDefine() {
		System.out.println("Invalid Age");
	}
}

public class CustomException {

	public static void main(String[] args) throws UserDefine {
		int age = 18;
		if (age > 18) {
			System.out.println("voting age");
		} else {

			throw new UserDefine();

		}

	}

}

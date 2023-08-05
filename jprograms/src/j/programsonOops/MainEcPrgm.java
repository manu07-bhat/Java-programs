package j.programsonOops;

class User {
	private Integer id;
	private String userName;
	private String password;

	public User(Integer id, String userName, String password) {
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

	public User() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

class UserBO {
	private User[] getUser() {
		User[] users = new User[5];
		users[0] = new User(1, "Louis", "BCDEF");
		users[1] = new User(2, "Messie", "hpphmf1:");
		users[2] = new User(3, "Steve", "opefkt");
		users[3] = new User(4, "Kallis", "23456778");
		users[4] = new User(5, "Wipro", "A$%");

		return users;
	}

	private String encryptPassword(String password) {
		String res = "";

		for (int i = 0; i < password.length(); i++) {
			res = res + (char) (password.charAt(i) + 1);
		}

		return res;
	}

	public boolean validate(String userName, String Password) {
		User[] users = getUser();
		for (int i = 0; i < users.length; i++) {
			String us = users[i].getUserName();
			String pas = users[i].getPassword();
			if (us.equals(userName) && pas.equals(encryptPassword(Password))) {
				return true;
			}

		}
		return false;
	}

}

public class MainEcPrgm {

	public static void main(String[] args) {
		UserBO u = new UserBO();
		System.out.println(u.validate("Louis", "ABCDE"));
		System.out.println(u.validate("Kallis", "12345667"));
	}

}

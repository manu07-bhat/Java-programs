package Practice;

class t {

	static void test() {
		int a = 10;

		try {

			a = a / 0;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

public class String2 {

	public static void main(String[] args) {
		t.test();
	}

}

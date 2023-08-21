package j.javaPrograms;

public class CountDigit {

	static void count() {
		int a = 123456789;
		String s = Integer.toString(a);
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			count++;
		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		count();
	}

}

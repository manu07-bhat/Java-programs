package Practice2;

public class Palandrome_Program {

	public static void main(String[] args) {
		String s1 = "kannaka";
		int i = 0, j = s1.length() - 1;
		while (i <= j) {
			if (s1.charAt(i) != s1.charAt(j)) {
				System.out.println("Not a palandrome");
				System.exit(0);
			} else {
				i++;
				j--;
			}

		}
		System.out.println("Palandrome");

	}

}

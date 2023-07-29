package j.strings;

public class Stringproblems {

	static void count() { // count the " "space in the given string
		String s = " How are you ";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);

	}

	static void countWords() { // count the num of words in the given string
		String s = "How are you doing";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count + 1);

	}

	static void charSearch() {

		String s = "How are you";
		String t ="o";
		char key = t.charAt(0);  //one method 
//		char key = 'o';				// another method
		
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == key) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		charSearch();
	}

}

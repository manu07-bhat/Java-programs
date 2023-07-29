package j.strings;

public class Stringbufferbuilder {

	public static void main(String[] args) {

		StringBuilder ts = new StringBuilder();
		System.out.println(ts.capacity());
		ts.append("java");
		ts.append(" javascript");
		ts.append(" python");
		System.out.println(ts);
		System.err.println(ts.capacity());
		System.out.println(ts.length());
		ts.trimToSize();
		ts.delete(0, 4);
		System.out.println(ts.capacity());
		System.out.println(ts);
		
		ts.insert(0, "JAVA");
		System.out.println(ts);
		
		ts.replace(0, 4, "JACK"); //Replacing JAVA with JACK
		System.out.println(ts);
		ts.reverse();
		System.out.println(ts);
	}

}

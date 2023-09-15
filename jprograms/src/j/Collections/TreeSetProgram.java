package j.Collections;

import java.util.TreeSet;

public class TreeSetProgram {
	// ceiling | floor | higher | lower
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(120);
		ts.add(60);
		ts.add(160);
		ts.add(30);
		ts.add(80);
		ts.add(140);
		ts.add(180);

		System.out.println(ts);

		System.out.println(ts.ceiling(181));
		System.out.println(ts.floor(30));

		System.out.println(ts.higher(50));
		System.out.println(ts.lower(30));

	}

}

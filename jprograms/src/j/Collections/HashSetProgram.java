package j.Collections;

import java.util.HashSet;

public class HashSetProgram {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(120);
		hs.add(60);
		hs.add(160);
		hs.add(30);
		hs.add(40);
		hs.add(80);
		hs.add(140);
		hs.add(140);
		hs.add(180);
		hs.add(180);

		System.out.println(hs);
		System.out.println(hs.contains(40));

	}

}

package j.Maps;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
//		HashMap mydetails = new HashMap();
		HashMap<String, String> mydetails = new HashMap<String, String>();

//		System.out.println(mydetails);
//		mydetails.put("FirstName ", " Jack");

		mydetails.put("FirstName", "Jack");
		mydetails.put("LastName", "Jill");
		mydetails.put("Number", "9743747438	");
		mydetails.put("Password", "##80$$");
		mydetails.put("Date of Birth", "20/11/1995");
		mydetails.put("Gender", "Male");

		System.out.println(mydetails);

		System.out.println(mydetails.get("FirstName"));
		System.out.println(mydetails.get("SurName"));
	}

}

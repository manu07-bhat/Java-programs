package j.Maps;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
//		HashMap mydetails = new HashMap();
		HashMap<String, String> mydetails = new HashMap<String, String>();

//		System.out.println(mydetails);
//		mydetails.put("FirstName ", " Jack");

		mydetails.put("FirstName", "Jack");
		mydetails.put("LastName", "Jack");
		mydetails.put("Number", "9743747438	");
		mydetails.put("Password", "##80$$");
		mydetails.put("Date of Birth", "20/11/1995");
		mydetails.put("Gender", "Male");

//		System.out.println(mydetails);

		System.out.println(mydetails.get("FirstName"));
		System.out.println(mydetails.get("SurName"));

		System.out.println(mydetails.size());

//		mydetails.clear();
//		mydetails.put("", "");
		System.out.println(mydetails.isEmpty());

		// checks for containsKey checks for key
		System.out.println(mydetails.containsKey("LastName"));

		// checks for containsValue checks for value
		System.out.println(mydetails.containsValue("Jack"));

		// Remove method will remove the key in HashMap
		mydetails.remove("Number1");
		System.out.println(mydetails);

		// Remove method will return the removed Key
		// if key is not present it will return null
		System.out.println(mydetails.remove("Number"));

		// remove with key and value it will return Boolean value
		// if the value is not present then it wont remove the value
		System.out.println(mydetails.remove("FirstName", "Jack"));

//		if (mydetails.containsKey("Country") == false) {
//			mydetails.put("Country", "India");
//		}

		mydetails.putIfAbsent("County", "null");

		System.out.println("\n" + mydetails);
	}

}

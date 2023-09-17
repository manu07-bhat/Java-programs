package j.Maps;

import java.util.*;

public class MapProgram1 {

	public static void main(String[] args) {
		HashMap<String, String> mydetails = new HashMap<String, String>();

		mydetails.put("FirstName", "Jack");
		mydetails.put("LastName", "Jack");
		mydetails.put("Number", "9743747438");
		mydetails.put("Password", "##80$$");
		mydetails.put("Country", "PAK");
		mydetails.put("Date of Birth", "20/11/1995");
		mydetails.put("Gender", "Male");

		HashMap<String, String> myData = new HashMap<String, String>();
		myData.put("Email", "Email@gmail.com");
		myData.put("Country", "India222");
		myData.put("Blood", "o+");

//		Set<String> keys = myData.keySet();
//
//		for (String key : keys) {
//			String val = myData.get(key);
//			mydetails.put(key, val);
//		}

		// for the above code we can use method
		mydetails.putAll(myData);

		System.out.println(mydetails);
	}

}

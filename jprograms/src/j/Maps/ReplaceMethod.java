package j.Maps;

import java.util.*;

public class ReplaceMethod {

	public static void main(String[] args) {
		HashMap<String, String> mydetails = new HashMap<String, String>();

		mydetails.put("FirstName", "Jack");
		mydetails.put("LastName", "Jack");
		mydetails.put("Number", "9743747438");
		mydetails.put("Password", "##80$$");
		mydetails.put("Country", "PAK");
		mydetails.put("Date of Birth", "20/11/1995");
		mydetails.put("Date of Birth", "20/11/1995");
		mydetails.put("Date of Birth", "20/11/1995");
		mydetails.put("Gender", "Female");

		mydetails.replace("LastName", "abcd");

		mydetails.replace("Gender", "Female", "Others");

		System.out.println(mydetails);
	}

}

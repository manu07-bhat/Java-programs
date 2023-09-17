package j.Maps;

import java.util.*;

public class Built_inMethods {

	public static void main(String[] args) {
		TreeMap<String, String> obj = new TreeMap<String, String>();
		obj.put("04:30", "spicejet");
		obj.put("09:00", "indigo");
		obj.put("11:00", "spicejet");
		obj.put("13:00", "goair");
		obj.put("16:00", "vistara");
		obj.put("21:00", "indigo");
		obj.put("21:30", "airindia");
		obj.put("23:30", "goair");

//	System.out.println(obj);
		// obj.keySet() will fetch the keySet
		System.out.println(obj.keySet());

	}

}

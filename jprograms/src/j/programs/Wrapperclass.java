package j.programs;

public class Wrapperclass {

	public static void main(String[] args) {
	Integer a = new Integer(144);
	Byte b = new Byte((byte)10);
	System.out.println(a+b);
	
	Character c = new Character((char)65);
	Boolean d = new Boolean(false);
	System.out.println(c+" "+d);
	
	String s = new String("111kannda");
	System.out.println(s);
	
	
	String s1[] = {"java","kannada"};
	for (int i = 0; i < s1.length; i++) {
		System.out.println(s1[i]);
	}
	
	
	String a1 = "JAVA";
//	String a2 = "JAVA";
	String a3 = new String("JAVA");
	
	
	
	
	
	
	if (a3.equals(a1)) {
		System.out.println("equal");
	} else {
		System.out.println("not equal");
	}
		
	
//	if (a1 == a3) {
//		System.out.println("references");
//	} else {
//		System.out.println("no - references");
//	}
//	
	}

}
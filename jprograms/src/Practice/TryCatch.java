package Practice;

public class TryCatch {

	public static void main(String[] args) {

		try {
			int a = 10/0;
			
		} catch (Exception e) {
System.out.println(e);
		}
//		catch (ArithmeticException ) {	//Unreachable code
//			// TODO: handle exception
//		}
	}

}

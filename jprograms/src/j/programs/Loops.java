package j.programs;

public class Loops {

	static void forLoop(int a) {

		for (int i = 0; i <= a; i++) {
			System.out.println(i);
		}
	}

	static void whileLoop(int a) {

		while (a <= 10) {
			System.out.println(a);
			a++;
		}
	}

	static void dowhileLoop(int a) {

		do{
			System.out.println(a);
			a++;
		}while (a <= 10);
	}
	
	static void switchCase(int day) {
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
		
	}

	public static void main(String[] args) {
//		forLoop(10);
//		whileLoop(1);
//		dowhileLoop(1);
//		switchCase(5);
		
	}

}

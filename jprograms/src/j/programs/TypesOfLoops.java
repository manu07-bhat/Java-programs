package j.programs;

public class TypesOfLoops {
	
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
		
		  switchCase(6);
		/* Mainly 4 types of loop 
			for loop
			for each
			do while loop
 			while loop  */
		
		//for loop for displaying arguments in cmdLine
		for (int i = 0; i <= 2; i++) {
			System.out.println(args[i]);
		}
		System.out.println("\n");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		//while
		int a=10;  // initialisation
		while (a<20) {  //Condition
			System.out.println(a);   //body
			a++;	//Inr/Dec
		}
			
		
		//do while
		
		int i=1;  //initialisation
		
		do {
			System.out.println(i);  //body
			i++; // Inr/Dec
		}
		
		while (i<1);  //condition
		
		//for each (Only for some cases )

		 int ar[] = { 10, 50, 60, 80, 90 };
		  
	        for (int element : ar)
	        {
	            System.out.print(element + " ");
	        }
	        
	        System.out.println("\n");
	        
	        //for loop 
	        for (int i1 = 0; i1 < ar.length; i1++) {
	        	System.out.println(ar[i1]);
	        }
	        
	      
		
	}

}

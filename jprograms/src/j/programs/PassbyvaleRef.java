package j.programs;

class car{
	String name;	//Refernece type assignment
	int cost;
}

public class PassbyvaleRef {	
	public static void main(String[] args) {
		
		//reference type
		car obj = new car();
		obj.name ="maruti";
		obj.cost =20_000_000;
		
		System.out.println(obj.name+" "+obj.cost);
		
		car y1;
		y1=obj;
		
		System.out.println(y1.name+" "+y1.cost);
		
		y1.name ="BMW";
		y1.cost = 60_000;
		
		System.out.println(obj.name+" "+obj.cost);

		
		
		System.out.println();
		//Value type assignment
		int x= 100;
		int y ;
		y=x;
		System.out.println(y+" "+x);
		x=300;
		System.out.println(y+" "+x);
		
	}

}

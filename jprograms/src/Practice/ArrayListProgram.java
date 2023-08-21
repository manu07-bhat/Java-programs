package Practice;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class ArrayListProgram {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");
		System.out.println("head:" + queue.element());

		String s = "121";
		int a = Integer.parseInt(s);

		String s2 = Integer.toString(a);

//		LinkedList<String> cars = new LinkedList<String>();
//		cars.add("Volvo");
//		cars.add("BMW");
//		cars.add("Ford");
//		cars.remove(0);
//		cars.set(1, "kan");
//
//		// Use addFirst() to add the item to the beginning
//		cars.addFirst("Mazda");
//		System.out.println(cars);
//		
//		for (String i : cars) {
//			  System.out.println(i);
//			}

//		ArrayList<String> car = new ArrayList<String>();
//		car.add("maruti");
//		car.add("maruti-800");
//		car.add("maruti-900");
//		car.add("maruti-600");
//		car.get(0);
//		car.remove(0);
//		car.set(2, "kan");
////		car.clear();
//		car.size();
//		System.out.println(car);
//		System.out.println(car.size());
//		
//		for (String i : car) {
//			  System.out.println(i);
//			}
	}

}

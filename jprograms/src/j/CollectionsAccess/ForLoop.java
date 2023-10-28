package j.CollectionsAccess;

import java.util.*;

public class ForLoop {

	static void arrayList() // Index Base Access
	{
		ArrayList obj = new ArrayList();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);

		System.out.println(obj);
		for (int i = 0; i <= obj.size() - 1; i++) {
			System.out.println(obj.get(i));
		}
	}

	static void linkedList() // Index Base Access
	{
		LinkedList obj = new LinkedList();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);

		System.out.println(obj);
		for (int i = 0; i <= obj.size() - 1; i++) {
			System.out.println(obj.get(i));
		}
	}

	static void arrayDeque() // Can't have Index Base Access because there is no index
	{
		ArrayDeque obj = new ArrayDeque();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);

		System.out.println(obj);
		for (int i = 0; i <= obj.size() - 1; i++) {
			System.out.println(((List) obj).get(i)); // gets error undefined
		}
	}

	static void priorityQueue() // Can't have Index Base Access because there is no index
	{
		PriorityQueue obj = new PriorityQueue();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);

		System.out.println(obj);
		for (int i = 0; i <= obj.size() - 1; i++) {
//			System.out.println(obj.get(i)); // gets error undefined
		}
	}

	static void treeSet() // Can't have Index Base Access because there is no index
	{
		TreeSet obj = new TreeSet();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);

		System.out.println(obj);
		for (int i = 0; i <= obj.size() - 1; i++) {
//			System.out.println(obj.get(i)); // gets error undefined
		}
	}

	static void hashSet() // Can't have Index Base Access because there is no index
	{
		HashSet obj = new HashSet();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);

		System.out.println(obj);
		for (int i = 0; i <= obj.size() - 1; i++) {
//			System.out.println(obj.get(i)); // gets error undefined
		}
	}

	static void linkedHashSet() // Can't have Index Base Access because there is no index
	{
		LinkedHashSet obj = new LinkedHashSet();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);

		System.out.println(obj);
		for (int i = 0; i <= obj.size() - 1; i++) {
//			System.out.println(obj.get(i)); // gets error undefined
		}
	}

	public static void main(String[] args) {
		arrayList();
		linkedList();
//		arrayDeque(); //ClassCastException
	}

}

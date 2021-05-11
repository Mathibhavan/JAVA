package Collection_Concepts;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList<String> fruit = new LinkedList<String>();
		fruit.add("Mango");
		fruit.add("Apple");
		fruit.add("orange");
		fruit.add("Kiwi");
		fruit.add("Banana");
		fruit.addFirst("Papaya");
		
		System.out.println(fruit.getLast());
		
	}

}

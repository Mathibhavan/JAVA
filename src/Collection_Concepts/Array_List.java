package Collection_Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<String> planet = new ArrayList<String>();
		planet.add("Mercury");
		planet.add("Venus");
		planet.add("Earth");
		planet.add("Mars");
		
		
		Collections.sort(planet);
		
		/*System.out.println(planet);
		System.out.println(planet.get(2));
		System.out.println(planet.set(3, "MARS"));
		System.out.println(planet.size());
		System.out.println(planet.remove(3));*/
		
		/*for (int i = 0; i < planet.size(); i++) {
			System.out.println(planet.get(i));
			*/
		
		for (String string : planet) {
			System.out.println(string);
		}
		
		}
		
	}
	


//List ArrayList list1=new ArrayList();
//List LinkedList list2=new LinkedList();
//List vector list3=new Vector();
//List stack list4=new stack();
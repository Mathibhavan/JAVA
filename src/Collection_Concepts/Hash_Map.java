package Collection_Concepts;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "POP");
		map.put(2, "LOL");
		map.put(3, "SIS");
		map.put(4, "FOR");
		
		//map.remove(3);
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("lol"));
		
		/*System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get(4));*/
		
		for (Integer i : map.keySet()) {
			System.out.println("key =" +i+ "value =" +map.get(i) );
		}
		
		/*for (String string : map.values()) {
			System.out.println(string);
		}*/
	

	}

}

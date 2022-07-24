package mapFramework;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		 LinkedHashMap map = new LinkedHashMap();
		 map.put(1, "One");
		 map.put('a', 741);
		 map.put(null, true);
		 map.put(false, 3.14f);
		 
		 System.out.println(map);
		 
		
	}
}

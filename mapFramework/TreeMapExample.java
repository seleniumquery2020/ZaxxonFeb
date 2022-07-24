package mapFramework;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap map = new TreeMap();
		map.put(1, "One");
		map.put(2, 741);
		map.put(5, "map");
		map.put(3, true);
		map.put(4, 3.14f);

		System.out.println(map);

		System.out.println("Ceiling Key = " + map.ceilingKey(5));

		System.out.println("Key Set = " + map.keySet());

		System.out.println("Desc Key Set = " + map.descendingKeySet());

		System.out.println("First Entry = " + map.firstEntry());

		System.out.println("First Key = " + map.firstKey());

		System.out.println("Floor Entry = " + map.floorEntry(6));

		// map.forEach( (k,v) -> System.out.println(v));

		System.out.println("Head Map = " + map.headMap(3));

		System.out.println("Higher Entry = " + map.higherEntry(2));

		//map.pollFirstEntry();

		//map.pollLastEntry();
		
		System.out.println(map);
		
		System.out.println("Tail Map = " + map.tailMap(3));
		
		SortedMap map1 = map.subMap(1, 4);
		
		System.out.println("Map1 = "+map1);
	
	}

}

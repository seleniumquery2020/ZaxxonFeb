package mapFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrySetExample {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");

		Collection collection = map.values();
		System.out.println("Values = " + collection);

		Set set = map.keySet();
		System.out.println("Keys = " + set);

		Set<Map.Entry<Integer, String>> mapEntry = map.entrySet();
		System.out.println("Entry = " + mapEntry);

		for (Map.Entry en : mapEntry) {

			System.out.println(en.getKey() + " " + en.getValue());
		}

	}

}

package mapFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put(1, "Swati");
		map.put('a', "Monika");
		map.put(null, "java");
		map.put('a', "Prachi");
		map.put(true, "Monika");
		map.put(2, "Monika");
		
		System.out.println(map);

		System.out.println("Key 1 is present = " + map.containsKey(1));
		System.out.println("Value java is present = " + map.containsValue("java"));

		// map.forEach((k,v) -> System.out.println(v));

		// System.out.println(map.get('a'));

		Set set = map.entrySet();

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Collection list = map.values();
		System.out.println(list);
		
		Set<Entry> entry = map.entrySet();
		
		for(Entry en : entry) {
			System.out.println(en.getKey() +" "+en.getValue());
		}
		
	}

}

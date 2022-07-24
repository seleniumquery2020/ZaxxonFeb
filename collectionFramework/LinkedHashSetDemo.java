package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Vector;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		

		Vector vector = new Vector();
		vector.addElement(85);
		vector.add(96);
		vector.add(2, "Value");
		vector.addElement('a');
		vector.add(true);
		vector.add(96);
		vector.addElement('&');
		vector.add(100);	
		
		System.out.println("Vector = "+vector);
		LinkedHashSet set = new LinkedHashSet();
		set.add('a');
		set.add(true);
		set.add(85);
		set.add(52.20);
		set.add(true);
		set.add("String");
		set.add(null);
		set.addAll(vector);
		
		System.out.println("LinkedHashSet = "+set);
		
	
	}

}

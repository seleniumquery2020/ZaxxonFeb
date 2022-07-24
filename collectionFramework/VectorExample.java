package collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		
		Vector vector = new Vector();
		vector.addElement(85);
		vector.add(96);
		vector.add(2, "Value");
		vector.addElement('a');
		vector.add(true);
		vector.add(2);
		vector.addElement('&');
		vector.add(100);		
		
		System.out.println(vector);
		
		System.out.println("Capacity of Vector = "+vector.capacity());
		System.out.println("Size of Vector = "+vector.size());
		
        vector.trimToSize();
        
		System.out.println("After trim Capacity of Vector = "+vector.capacity());
		System.out.println("After trim Size of Vector = "+vector.size());
		
		 Enumeration en = vector.elements();
		 
		 while(en.hasMoreElements()) {
			 System.out.println(en.nextElement());
		 }
	}

}

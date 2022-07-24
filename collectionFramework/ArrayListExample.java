package collectionFramework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>(); //Generic ArrayList
		names.add("Nilam");
		names.add(1,"Program");
		names.add("Selenium");
		names.add(3,"Kritika");
		names.add("Chetana");
		names.add("Java");

		System.out.println("Before sort = "+names);

		/*
		 * ListIterator<String> itr = names.listIterator(); while(itr.hasNext()) {
		 * if(itr.next().equals("Selenium")){ System.out.println(itr.previous());
		 * itr.next();
		 * 
		 * } }
		 */
		names.sort(null); //Ascending order
		
		names.sort(new Comparator<String>() { //Descending Order

			@Override
			public int compare(String o1, String o2) {
				
				//return o1.compareTo(o2);//Ascending Order
				return o2.compareTo(o1);//Descending Order
			}
		});
		
		System.out.println("After sort = "+names);
		
		List<String> sublist = names.subList(0, 3); //startIndex is same , but last index as LastIndex-1
		System.out.println("Sublist = "+sublist);
		
		names.trimToSize();
	}

}

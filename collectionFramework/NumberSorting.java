package collectionFramework;

import java.util.ArrayList;
import java.util.Comparator;

public class NumberSorting {

	
	public static void main(String[] args) {
		
		int arr[] = {1,5,3,6,2,4,8,9,7,10}; 
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int a : arr)		{
			list.add(a);			
		}
		
		System.out.println("List = "+list);
		list.sort(null);
		System.out.println("Ascending order sorting for List = "+list);
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2.compareTo(o1);
			}
		});
		
		System.out.println("Descending order sorting for List = "+list);
		
		Object[] values = list.toArray();
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i]+ " ");
		}		
	}
}

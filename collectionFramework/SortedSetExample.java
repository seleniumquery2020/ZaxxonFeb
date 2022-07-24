package collectionFramework;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Stack;
import java.util.TreeSet;

public class SortedSetExample {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();		
		stack.add(1);
		stack.add(21);
		stack.add(50);
		stack.add(4);
		stack.add(50);
		System.out.println("Stack = "+stack);
		
		
		TreeSet set = new TreeSet();
		set.add(96);
		set.add(45);
		set.add(16);
		set.add(21);
		set.add(51);
		
		System.out.println("Tree Set = "+set);
		
		set.addAll(stack);
		System.out.println("Tree Set = "+set);
		
		System.out.println("Ceiling value = "+ set.ceiling(20));
		 
		/*
		 * Iterator itr = set.descendingIterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		
		NavigableSet set1 = set.descendingSet();
		System.out.println("Navigable set = "+set1);
		
		System.out.println("First value = "+ set.first());
		System.out.println("Floor value = "+ set.floor(20));
		
	}

}

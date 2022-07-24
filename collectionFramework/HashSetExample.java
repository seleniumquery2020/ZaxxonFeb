package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class HashSetExample {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.add(0, "First");
		stack.add(1);
		stack.add(21);
		stack.add(50);
		stack.add(4);
		stack.add(50);
		System.out.println("Stack = "+stack);
		
		HashSet set = new HashSet();
		set.add('a');
		set.add(true);
		set.add(85);
		set.add(52.20);
		set.add(true);
		set.add("String");
		set.add(null);
		set.addAll(stack);
		
		System.out.println(set);
		System.out.println("Check presence of true using Contains Method : "+set.contains(true));
		System.out.println("Check presence of Stack using ContainsAll Method : "+set.containsAll(stack));
	
		// set.forEach(e -> System.out.println(e));

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}

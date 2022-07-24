package collectionFramework;
import java.util.LinkedList;
import java.util.Vector;
public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("Selenium");		
		list.offer("Webdriver");
		list.add(3.14);		
		System.out.println(list);
		list.offerFirst(21); //similar method addFirst
		list.offerLast(100); //similar method addLast
		
		System.out.println(list);
		/*Iterator itr  = list.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		System.out.println(list.element());
		
		System.out.println("First Value = "+list.getFirst());		
		System.out.println("Last Value = "+list.getLast());
		
		//list.pollLast();//list.removeLast();
		//System.out.println(list);
				
		System.out.println(list.peekLast());
		System.out.println(list);
		
		list.pop();
		System.out.println(list);
		
		list.push(852);
		System.out.println(list);
		

		
	}
}

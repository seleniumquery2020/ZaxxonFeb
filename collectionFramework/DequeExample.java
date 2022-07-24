package collectionFramework;

import java.util.ArrayDeque;

public class DequeExample {

	public static void main(String[] args) {

		ArrayDeque quArrayDeque = new ArrayDeque();

		quArrayDeque.add("qwerty");
		quArrayDeque.add(85);
		quArrayDeque.add('d');
		quArrayDeque.add(false);
		quArrayDeque.add("sweet");
		quArrayDeque.add("sweet");
		
		System.out.println(quArrayDeque);
		
		quArrayDeque.addFirst("first");
		quArrayDeque.addLast("last");
		
		System.out.println(quArrayDeque);
		
		quArrayDeque.offer("Selenium");
		System.out.println(quArrayDeque);
		
		System.out.println("Element method = "+quArrayDeque.element()+ ", Peek Method = "+quArrayDeque.peek());
		
		System.out.println("getFirst method = "+quArrayDeque.getFirst()+ ", PeekFirst Method = "+quArrayDeque.peekFirst());

		System.out.println("getLast method = "+quArrayDeque.getLast()+ ", PeekLast Method = "+quArrayDeque.peekLast());

		
		quArrayDeque.push("StackPush");
		
		System.out.println(quArrayDeque);
		
	}

}

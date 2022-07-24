package collectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
		
		   PriorityQueue queue = new PriorityQueue();
		   
		   queue.add("qwerty");
		   queue.add("abc");
		   queue.add("abcd");
		   queue.add("good");
		   queue.add("sweet");
		   queue.add("sweet");
		   
		   System.out.println(queue);
		   
		   System.out.println("Element method = "+ queue.element());
		   
		   queue.offer("Hello");
		   System.out.println(queue);
		   
		   System.out.println("Peek method = "+ queue.peek());
		   
		   System.out.println("Poll method = "+ queue.poll());
		   System.out.println(queue);
		   
	}

}

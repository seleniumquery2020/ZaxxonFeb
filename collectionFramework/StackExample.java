package collectionFramework;
import java.util.Stack;

public class StackExample {	
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.add(0, "First");
		stack.add(1);
		stack.add(21);
		stack.add(3);
		stack.add(4);
		stack.add(50);
	
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		stack.push(100);
		System.out.println(stack);
		
		System.out.println("Stack is empty = "+stack.empty());
	
		int index = stack.search(21);
		System.out.println("Index of 21 = "+index);
	}

}

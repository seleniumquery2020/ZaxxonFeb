package stringStringBufferBuilder;

public class StringBufferMethods {
	
	public static void main(String[] args) {
		
		StringBuffer buff = new StringBuffer("Java");
		StringBuffer buff1 = new StringBuffer("Java");
		
		System.out.println("Buff length = "+buff.length());
		System.out.println("Capacity of buff = "+buff.capacity());
		
		//buff.delete(0, 2);
		//System.out.println(buff);
		//buff.deleteCharAt(3);
		//System.out.println(buff);
		
		String s = buff.toString();
		String s1 = buff1.toString();		
		System.out.println(s.equals(s1));
		
		buff.insert(4,"Program");
		System.out.println(buff);
		
		buff.replace(4, 11, " Execution");
		System.out.println(buff);
		
		System.out.println(buff.reverse());
		
		System.out.println("Buff length = "+buff.length());
		System.out.println("Capacity of buff = "+buff.capacity());
		buff.trimToSize();
		System.out.println("After trim to Size Capacity of buff = "+buff.capacity());
	}

}

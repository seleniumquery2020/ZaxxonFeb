package oopsConcept;

public interface Calculator {
	
	public void addition(int a,int b);
	
	public void subtraction(int a,int b,int c);
	
	public static void multiplication(int a , int b) {
		
		int c = a*b;
		System.out.println("Multiplication of "+a+" and "+b+" = "+c);
	}
	
}

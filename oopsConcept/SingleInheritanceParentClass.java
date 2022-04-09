package oopsConcept;

public class SingleInheritanceParentClass {
	
	public void m1() {
		int a = 85;
		int b = 89;
		int c = a+b;
		System.out.println("Addition of a and b = "+c);
	}

	public static void m2() {
		int a = 185;
		int b = 89;
		int c = a-b;
		System.out.println("Subtraction of a and b = "+c);
	}
	
	public static void main(String[] args) {
		m2();
		SingleInheritanceParentClass parent = new SingleInheritanceParentClass();
		parent.m1();
	}
}

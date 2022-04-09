package oopsConcept;

public class C extends B {

	@Override
	public void m1() {
		System.out.println("m1 method from C class");

	}

	@Override
	public void m2() {
		System.out.println("M2 method from Class C");
	}

	public static void main(String[] args) {

		A a = new C();		
		a.m2(); //M2 method from Class A
		
		B b = new C();
		b.m2(); //M2 method from Class B
		
		C c = new C();
		c.m2(); //M2 method from Class C
		
	}
}

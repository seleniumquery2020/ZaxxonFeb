package oopsConcept;

public class SingleInheritanceChildClass extends SingleInheritanceParentClass  {
	
	public void m3() {
		int a = 85;
		int b = 89;
		int c = a*b;
		System.out.println("Multiplication of a and b = "+c);
	}

	public static void main(String[] args) {
		
		SingleInheritanceChildClass child = new SingleInheritanceChildClass();
		child.m1();
		m2();
		child.m3();
		
		SingleInheritanceParentClass parentChild = new SingleInheritanceChildClass();
		parentChild.m1();
	    m2();
	   
	    
	    SingleInheritanceParentClass parent = new SingleInheritanceParentClass();
		parent.m1();
		m2();
		
		
		//SingleInheritanceChildClass childParent = new SingleInheritanceParentClass();
	}
}

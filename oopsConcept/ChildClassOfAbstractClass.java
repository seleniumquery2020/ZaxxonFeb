package oopsConcept;

public class ChildClassOfAbstractClass extends AbstractParentClass {

	@Override
	public void operation() {
		
	}

	public static void main(String[] args) {
		ChildClassOfAbstractClass child = new ChildClassOfAbstractClass();
		child.display();
		print();
		child.operation();
		
		AbstractParentClass parent = new ChildClassOfAbstractClass();
		parent.display();
		print();
		parent.operation();
		
	}
}

package arthimaticOperator;

public class AssignmentOperator {
	
	
	public static void assignmentOperation() {
		
		int a = 50;
	
		 //a = a+ 60;
	
		a += 60;
		System.out.println("Plus Assignment = "+a);
		
		a *= 60;
		System.out.println("Mul Assignment = "+a);
	}
	
	public static void main(String[] args) {
		assignmentOperation();
	}
}

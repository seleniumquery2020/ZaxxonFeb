package oopsConcept;

public class InterviewProgramRelatedToOverLoading {
	
	public static void print(Object s) {
		System.out.println("Object parameter method");
	}

	public static void print(String s) {
		System.out.println("String parameter method");
	}

	public static void print(Integer s) {
		System.out.println("Integer parameter method");
	}
	
	
	
	public static void main(String[] args) {
		InterviewProgramRelatedToOverLoading load = new InterviewProgramRelatedToOverLoading();
		load.print("java");//By default call to String para method 
							//if string para method is not present than call to object para method
		
		Integer i = 81;
		load.print(i);//By default call to Integer para method 
			  	     //if Integer para method is not present than call to object para method
		
	}
}

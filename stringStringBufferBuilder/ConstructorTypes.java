package stringStringBufferBuilder;

public class ConstructorTypes {

	
	String s;
	
	ConstructorTypes(){  //Non-Parameterized Constructor
		
		s = "";
		System.out.println(s);
		
	}
	
	
	ConstructorTypes(String a) { //Parameterized Constructor

		s = a;
		System.out.println(s);

	}
	
	public static void main(String[] args) {
		
	//ConstructorTypes test = new ConstructorTypes();  //Default Constructor - When constructor is not present in class then
		 //compiler creates default constructor (constructor without parameter)
		ConstructorTypes test = new ConstructorTypes();  //Non-Parameterized Constructor
		ConstructorTypes test1 = new ConstructorTypes("Parameter");
	}
}

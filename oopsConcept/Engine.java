package oopsConcept;

public  class Engine {
	
	public Engine(){
		System.out.println("Engine Class execution started");
	}
	
	public Engine(String s){
		System.out.println("Engine Class Constructor with String as "+s);
	}
	
	
	public static void wheel(int numberOfWheels) {
		System.out.println("Number of wheels = "+numberOfWheels);
		wheel(2);
	}
	
	public void power(String cc) {
		System.out.println("Power of Engine: "+cc);
	}

	public static void main(String[] args) {
		wheel(4);
	}
	
}

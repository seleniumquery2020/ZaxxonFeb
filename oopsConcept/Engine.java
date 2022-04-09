package oopsConcept;

public abstract class Engine {
	
	public Engine(){
		System.out.println("Engine Class execution started");
	}
	
	public abstract void wheel();
	
	public void power(String cc) {
		System.out.println("Power of Engine: "+cc);
	}

}

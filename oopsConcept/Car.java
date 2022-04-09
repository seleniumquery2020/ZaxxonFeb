package oopsConcept;

public class Car extends Vehicle{
	
	public Car(){
		System.out.println("Car Class execution started");
	}
	
	public void seats() {
System.out.println("This is a personal car with only 2 seats");
	}

	public static void main(String[] args) {
		
		Car car = new Car();
		car.power("150 CC");
		car.wheel(4);
		car.seats();
		
		Vehicle vehicle = new Car();
		vehicle.power("200 CC");
		vehicle.wheel(6);
		
		Engine engine = new Car();
		engine.power("250 cc");
		
	}
}

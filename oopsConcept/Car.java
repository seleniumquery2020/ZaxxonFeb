package oopsConcept;

public class Car extends Engine {

	public Car() {
		this(8);
		System.out.println("Car Constructor");
	}

	public Car(int a) {
		super("super");
		System.out.println("Car Constructor with number as "+a);
	}

	@Override
	public void power(String cc) {
		super.power("150 cc");
		System.out.println("Tentative Power = " + cc);
		System.out.println("Actual power = 20 CC extra");
	}

	public static void wheel(int numberOfWheels) {
		System.out.println("Number Car of wheels = " + numberOfWheels);
	}

	public static void main(String[] args) {
		Car car = new Car();

	}

}

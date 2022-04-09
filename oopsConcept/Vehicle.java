package oopsConcept;

public class Vehicle extends Engine{

	public Vehicle(){
		System.out.println("Vehicle Class execution started");
	}
	
	public void wheel(int no) {
		
		System.out.println("Number of Wheel: "+no);
	}

	@Override
	public void wheel() {
		// TODO Auto-generated method stub
		
	}
}

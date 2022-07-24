package oopsConcept;

public class StudentDetails {
	
	public static void saveInquiry(String name,long number) {
		System.out.println("Student Name & number = "+name+" "+number);
	}
	
	public static void saveInquiry(String name,long number,String address) {
		System.out.println("Student Name & Addresss = "+name+" "+address);
	}

	public void feesCalculation(int a,float value) {
		float fees = a - (a * (value/100));
		System.out.println("Fees = "+fees);
	}
	
	public void feesCalculation(float value,int a) {
		float fees = a + value;
		System.out.println("Fees = "+fees);
	}
	
	public static void main(String[] args) {
		
		saveInquiry("Chetana", 8523697410l);
		saveInquiry("Kritika", 8547123690l,"Pune");
		StudentDetails studentDetails =  new StudentDetails();
		studentDetails.feesCalculation(5000,20.0f);
		studentDetails.feesCalculation(5.36f,8965);
	}
}

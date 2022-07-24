package classInJava;

public class StackOverFlowErrorExample {
	
	public static void m1() {
		System.out.println("M1 method");
	}

	public static void m2() {
		m1();
		System.out.println("M2 method");
	}
	
	
	public static void m3() {
		m2();
		System.out.println("M3 method");
	}
	
	
	public static void m4() {
		m3();
		//m4(); //Exception in thread "main" java.lang.StackOverflowError
		System.out.println("M4 method");
	}
	
	public static void main(String[] args) {
		m4();
	}
}

package keywordsInJava;

public class ThisKeywordUse {

	String s = "This Variable";
	public void m1() {
		System.out.println("m1 method");
	}

	public void m2() {
		System.out.println("m2 method");
		this.m1();
		System.out.println(this.s);
	}

	public static void m3() {
		System.out.println("m3 method");
		//this.m1();
	}
	
	public static void main(String[] args) {
		
		ThisKeywordUse obj = new ThisKeywordUse();
		obj.m1();
		obj.m2();
		m3();
	}
}

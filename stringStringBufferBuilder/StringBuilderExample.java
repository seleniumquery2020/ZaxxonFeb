package stringStringBufferBuilder;

public class StringBuilderExample {
	
	public static void main(String[] args) {
		
		StringBuilder build = new StringBuilder();
		StringBuilder build1 = new StringBuilder("Selenium");
		String s = "Automation";
		StringBuilder build2 = new StringBuilder(s);
		StringBuilder build3 = new StringBuilder(build1);
		
		System.out.println(build1);
		build1.append(true);
		
		System.out.println(build1);
	}

}

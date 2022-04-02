package keywordsInJava;

public class ReturnKeywords {

	public static int m1() {
		int num = 50;
		int num1 = 60;
		int result = num + num1;
		return result;
	}

	public static boolean m2() {
		String s = "java";
		String s1 = "selenium";
		boolean flag = false;
		if (s.equals(s1)) {
			flag = true;
		}

		return flag;
	}

	public static void main(String[] args) {
		int s = m1();
		int add = s + 100;
		System.out.println(add);

		System.out.println(m2());

	}
}

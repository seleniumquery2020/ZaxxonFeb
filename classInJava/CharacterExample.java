package classInJava;

public class CharacterExample {

	public static void main(String[] args) {

		String s = "0208563214";

		int number = Integer.parseInt(s);
		System.out.println(number);

		String s1 = "java7856Pro9r5m";
		System.out.print("Numbers from String = ");
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				System.out.print(ch[i]+" ");
			}
		}
	}

}

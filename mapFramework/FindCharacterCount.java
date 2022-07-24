package mapFramework;
/* Output - 
p=1
a=2
s=2
g=1
e=1
*/
public class FindCharacterCount {

	public static void main(String[] args) {

		String s = "passage";
		String str = "[abcdefghijklmnopqrstuvwxyz]";

		s = s.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			int count = 0;

			for (int j = 0; j < s.length(); j++) {

				if (str.charAt(i) == s.charAt(j)) {
					count++;
				}

			}
			if (s.contains(Character.toString(str.charAt(i)))) {
				System.out.println( str.charAt(i) + " = " + count);
			}
		}

	}

}

package controlStatement;

public class ReverseOrderArray {

	public static void main(String[] args) {
		//a,e,i,o,u
		char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };

		System.out.println(ch.length - 1);

		for (int i = ch.length - 1; i >= 0; i--) {
			if(ch[i] == 'a') {
			System.out.println(ch[i]);
			}
		}

	}
}

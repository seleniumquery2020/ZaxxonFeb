package stringStringBufferBuilder;

public class FirstCharacterInCapital {
	
	public static void main(String[] args) {
		
		String s = "counteRSIGN technology";
		
		String[] str = s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i].substring(0,1).toUpperCase()+ str[i].substring(1).toLowerCase() + " ");
		}
		
	}

}

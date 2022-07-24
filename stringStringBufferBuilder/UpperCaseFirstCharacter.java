package stringStringBufferBuilder;

public class UpperCaseFirstCharacter {
	
	public static void main(String[] args) {
		
		String input = "monika karbhari gotkal";
		String output= "";
		
		String[] str = input.split(" ");
		for (int i = 0; i < str.length; i++) {
			
			String s = str[i].substring(0,1).toUpperCase();
			output = output + s + str[i].substring(1)+" "; //Monika Karbhari Gotkal 
		}
		System.out.println(output);
	}

}

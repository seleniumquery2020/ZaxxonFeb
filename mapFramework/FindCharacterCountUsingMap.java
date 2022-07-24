package mapFramework;

/* WAP to count characters in String 
Input = "passage"
Output - 
p=1
a=2
s=2
g=1
e=1
*/

import java.util.LinkedHashMap;

public class FindCharacterCountUsingMap {

	
	public static void main(String[] args) {

		String s = "passage";
		s = s.toLowerCase();
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			
			if(map.containsKey(s.charAt(i))) {
				
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			
			}else {
				
			   map.put(s.charAt(i),1);
			}
			
			
		}
		
		map.forEach((k,v) -> System.out.println(k +"="+v));
	}
}

package accessModifier;

 enum example{demo,selenium,java,WebDriver}
 
class EnumExample{


public static void main(String[] args) {
	
	
	for(example e : example.values()) {
		System.out.println(e);
	}
}
}

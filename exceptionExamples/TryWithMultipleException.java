package exceptionExamples;

public class TryWithMultipleException {

	public static void arrayOperation() {

		int arr[] = { 1, 2, 3, 4, 5 };
		String s = null;
		try {
			
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				
			}
			
			//System.out.println(s.charAt(0));
			
		} finally {
			System.out.println("Finally Block");
		}

	}

	public static void main(String[] args) {
		arrayOperation();
	}

}

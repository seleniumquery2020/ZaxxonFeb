package exceptionExamples;

public class IndexOutOfBoundExeptionExample {

	public static void arrayException() {

		int arr[] = new int[5];
		int a = 11;
		for (int i = 0; i < arr.length; i++) { //Index 5 out of bounds for length 5
			arr[i] = a++;
		}

		for (int j : arr) {
			System.out.print(j + " ");
		}
		System.out.println();
	}

	public static void stringIndexBoundException() {

		String str = "Program";

		System.out.println(str.charAt(7)); //String index out of range: 7
	}

	public static void main(String[] args) {
		arrayException();
		stringIndexBoundException();
	}

}

package classInJava;

import java.util.Arrays;

public class ArraysClass {

	
	public static void main(String[] args) {
		
		int arr[] = {9,6,5,3,7,2,4,1,0,8};
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

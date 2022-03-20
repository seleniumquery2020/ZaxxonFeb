package controlStatement;

public class TwoDimesionalArrayExample {

	public static void main(String[] args) {
		// 2*3
		int arr[][] = { { 10, 20, 30 }, { 40, 50, 60,70,80 } };

		System.out.println("First Dim : " +arr.length);

		System.out.println("Second Dim : " +arr[0].length);

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {

				System.out.println(arr[i][j]);
			}
		}
	}
}

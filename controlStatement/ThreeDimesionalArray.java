package controlStatement;

public class ThreeDimesionalArray {

	public static void main(String[] args) {
		// 2*3*2
		float area[][][] = { { { 1.1f, 1.2f }, { 1.3f, 1.4f }, { 1.5f, 1.6f } },
				{ { 2.1f, 2.2f }, { 2.3f, 2.4f }, { 2.5f, 2.6f } } };

		int firstDim = area.length;
		int secondDim = area[0].length;
		int thirdDim = area[0][0].length;
		
		for (int i = 0; i < firstDim; i++) {
			
			for (int j = 0; j < secondDim; j++) {
				
				for (int k = 0; k < thirdDim; k++) {
					System.out.print(area[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
